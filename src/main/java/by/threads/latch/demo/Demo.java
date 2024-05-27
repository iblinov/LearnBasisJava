package by.threads.latch.demo;

import by.threads.latch.workflow.Worker;
import by.threads.latch.workflow.Stage;
import by.threads.latch.exception.StageException;
import by.threads.latch.workflow.Working;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo {

    private static final int RANDOM_HIGH_BOUND = 10;
    private static final int WORKERS_AMOUNT = 6;

    public static void main(String[] args) {

        List<String> workersNames = Stream.of(
                "Robert(Tests)", "Rob(Tests)", "John(Tests)", "Lee(Code)", "Bob(Code)", "Mike(Support)"
        ).collect(Collectors.toList());
        List<Working> runList = IntStream.range(0, WORKERS_AMOUNT).mapToObj(i -> (Working) () -> {
            try {
                TimeUnit.SECONDS.sleep(ThreadLocalRandom.current().nextInt(RANDOM_HIGH_BOUND));
                System.out.println(workersNames.get(i) + " is finished.");
            } catch (InterruptedException e) {
                System.out.println("Worker " + workersNames.get(i) + " is stopped.");
            }
        }).limit(WORKERS_AMOUNT).collect(Collectors.toList());

        List<Worker> lowWorkers = IntStream.rangeClosed(0, 2).mapToObj(i ->
                new Worker(workersNames.get(i), runList.get(i))
        ).collect(Collectors.toList());
        List<Worker> middleWorkers = IntStream.rangeClosed(3, 4).mapToObj(i ->
                new Worker(workersNames.get(i), runList.get(i))
        ).collect(Collectors.toList());
        List<Worker> highWorkers = IntStream.rangeClosed(5, 5).mapToObj(i ->
                new Worker(workersNames.get(i), runList.get(i))
        ).collect(Collectors.toList());

        Stage lowStage = new Stage("Witting tests", lowWorkers, Stage.StageStyle.WAIT_ANY, 1, TimeUnit.MINUTES)
                .onStageStarting(() -> System.out.println("Witting tests stage is started."))
                .onStageEnding(() -> System.out.println("Witting tests stage is finished."));
        Stage middleStage = new Stage("Writing code", middleWorkers, Stage.StageStyle.WAIT_ALL, 1, TimeUnit.MINUTES)
                .onStageStarting(() -> System.out.println("Writing code stage is started."))
                .onStageEnding(() -> System.out.println("Writing code stage is finished."));
        Stage highStage = new Stage("Supporting", highWorkers, Stage.StageStyle.WAIT_ALL, 1, TimeUnit.MINUTES)
                .onStageStarting(() -> System.out.println("Supporting stage is started."))
                .onStageEnding(() -> System.out.println("Supporting stage is finished."));
        lowStage.init(middleStage);
        middleStage.init(highStage);
        highStage.init();

        try {
            lowStage.starting();
        } catch (StageException e) {
            System.out.println("Some problems with stages execution.");
        }
    }

}
