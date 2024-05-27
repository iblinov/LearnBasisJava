package by.bsu2.streams;

/**
 * Created by Ihar_Blinou on 6/26/2017.
 */
public class CustomException extends Throwable {
    public CustomException() {
    }

    public CustomException(String message) {
        super(message);
    }

    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomException(Throwable cause) {
        super(cause);
    }
}
