package by.bsu2.threads.future;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class IdRandomGenerator implements Callable<Long> {
    @Override
    public Long call() throws Exception {
        TimeUnit.SECONDS.sleep(1);
        UUID uuid = UUID.randomUUID(); // имитация вычислений
        return uuid.getMostSignificantBits();
    }
}
