package pe.oh29oh29.exceptionhandler.case04.exception;

public class MyResourceNotFoundException extends RuntimeException {
    public MyResourceNotFoundException() {
        super("[ExceptionHandler] ResponseStatusException custom exception");
    }
}
