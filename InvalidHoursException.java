public class InvalidHoursException extends Exception {
    public InvalidHoursException() {
        super("Invalid hours: Hours must be between 0 and 84.");
    }
}
