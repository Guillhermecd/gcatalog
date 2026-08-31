package gcatalog.services.exceptions;

public class DatabaseException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public DatabaseException(String message) {
        super(message);
    }

    public Object getBindingResult() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
