public class InvalidHourlyRateException extends Exception {
    public InvalidHourlyRateException() {
        super("Invalid hourly rate: Rate must be positive and up to 25.");
    }
}
