package by.threads.training.workflow;

import by.threads.training.exception.StageException;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 */
public class Stage {

    public enum StageStyle { WAIT_ANY, WAIT_ALL }

    private String name;
    private List<Worker> workers;
    private StageStyle style;
    private CountDownLatch latch;
    private long waitTime;
    private TimeUnit waitTimeUnit;
    private Runnable onStageEnding = () -> {};
    private Runnable onStageStarting = () -> {};
    private Stage nextStage;

    private final int LATCH_CAPACITY = 1;

    public Stage(String name, List<Worker> workers, StageStyle style, long waitTime, TimeUnit waitTimeUnit) {
        this.name = name;
        this.workers = workers;
        this.style = style;
        this.waitTime = waitTime;
        this.waitTimeUnit = waitTimeUnit;
        configureLatch();
    }

    public void init(Stage nextStage){
        this.nextStage = nextStage;
        this.workers.forEach(c -> c.setStage(this));
    }

    public void init(){
        this.nextStage = null;
        this.workers.forEach(c -> c.setStage(this));
    }

    private void configureLatch() {
        if (this.style == StageStyle.WAIT_ALL) {
            this.latch = new CountDownLatch(workers.size());
        } else if (this.style == StageStyle.WAIT_ANY) {
            this.latch = new CountDownLatch(LATCH_CAPACITY);
        }
    }

    public Stage onStageEnding(Runnable onStageEnding) {
        this.onStageEnding = onStageEnding;
        return this;
    }

    public Stage onStageStarting(Runnable onStageStarting) {
        this.onStageStarting = onStageStarting;
        return this;
    }

    public void start() throws StageException {
        this.onStageStarting.run();
        ExecutorService service = Executors.newFixedThreadPool(workers.size());
        this.workers.forEach(service::submit);
        service.shutdown();
        try {
            if (this.latch.await(this.waitTime, this.waitTimeUnit)) {
                this.onStageEnding.run();
                if (this.nextStage != null) {
                    service.shutdownNow();
                    this.nextStage.start();
                }
            } else {
                throw new StageException("Stage " + name + " can't be finished in time.");
            }
        } catch (StageException | InterruptedException e) {
            service.shutdownNow();
            throw new StageException(e);
        }

    }

    public String getName() {
        return name;
    }

    public CountDownLatch getLatch() {
        return latch;
    }

    public StageStyle getStyle() {
        return style;
    }

    public long getWaitTime() {
        return waitTime;
    }

    public TimeUnit getWaitTimeUnit() {
        return waitTimeUnit;
    }

    public Stage getNextStage() {
        return nextStage;
    }

}
