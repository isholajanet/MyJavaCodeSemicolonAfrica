package africa.semicolon.ArrayPractice.exceptions;

public class TurtleException extends Exception{
    public TurtleException() {
        super();
    }

    public TurtleException(String message) {
        super(message);
    }

    public TurtleException(String message, Throwable cause) {
        super(message, cause);
    }

    public TurtleException(Throwable cause) {
        super(cause);
    }
}
