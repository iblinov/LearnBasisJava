package by.threads.latch.workflow;

/**
 *
 */
public class Worker implements Runnable, Working {

    private String name;
    private Working working;
    private Stage stage;

    public Worker(String name, Working working) {
        this.name = name;
        this.working = working;
    }

    @Override
    public void run() {
        working.work();
        stage.getLatch().countDown();
    }

    public String getName() {
        return name;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @Override
    public void work() {
        //empty
    }
}
