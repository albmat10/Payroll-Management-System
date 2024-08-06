public class InvalidNameException extends Exception {
    public InvalidNameException() {
        super("Invalid name: Name cannot be empty.");
    }
}
