package africa.semicolon.Exceptions;

public class AirlineReservationException extends Exception {
    public AirlineReservationException() {
        super();
    }

    public AirlineReservationException(String message) {
        super(message);
    }

    public AirlineReservationException(String message, Throwable cause) {
        super(message, cause);
    }

    public AirlineReservationException(Throwable cause) {
        super(cause);
    }
}
