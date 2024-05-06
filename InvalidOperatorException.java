public class InvalidOperatorException extends Exception {
    public InvalidOperatorException() {
        super("Operateur invalide");
    }
    public InvalidOperatorException(String message) {
        super(message);
    }
}
