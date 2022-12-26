package spring.com.banking.integration.error;

public class PkIdNotFound extends Exception{
    public PkIdNotFound() {
        super();
    }

    public PkIdNotFound(String message) {
        super(message);
    }

    public PkIdNotFound(String message, Throwable cause) {
        super(message, cause);
    }

    public PkIdNotFound(Throwable cause) {
        super(cause);
    }

    protected PkIdNotFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
