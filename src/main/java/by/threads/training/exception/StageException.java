package by.threads.training.exception;

/**
 *
 */
public class StageException extends Exception {

    public StageException() {
    }

    public StageException(String s) {
        super(s);
    }

    public StageException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public StageException(Throwable throwable) {
        super(throwable);
    }

}
