package pe.oh29oh29.exceptionhandler.case02.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * ResponseStatusExceptionResolver
 * <p>
 * This resolver was also introduced in Spring 3.0 and is enabled by default in the DispatcherServlet.
 * Its main responsibility is to use the @ResponseStatus annotation available on custom exceptions and to map these exceptions to HTTP status codes.
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class MyResourceNotFoundException extends RuntimeException {
    public MyResourceNotFoundException() {
        super("[ExceptionHandler] ResponseStatusExceptionResolver custom exception");
    }
}
