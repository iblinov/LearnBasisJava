package by.threads.training.workflow;

/**
 *
 */
public class Worker implements Runnable {

    private String name;
    private Runnable run;
    private Stage stage;

    public Worker(String name, Runnable run) {
        this.name = name;
        this.run = run;
    }

    @Override
    public void run() {
        run.run();
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

}
