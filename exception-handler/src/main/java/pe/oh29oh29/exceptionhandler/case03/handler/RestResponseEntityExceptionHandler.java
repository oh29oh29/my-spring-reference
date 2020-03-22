package pe.oh29oh29.exceptionhandler.case03.handler;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * ControllerAdvice
 * <p>
 * Spring 3.2 brings support for a global @ExceptionHandler with the @ControllerAdvice annotation.
 * This enables a mechanism that breaks away from the older MVC model and makes use of ResponseEntity along with the type safety and flexibility of @ExceptionHandler:
 */
@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {ArrayIndexOutOfBoundsException.class, StringIndexOutOfBoundsException.class})
    protected ResponseEntity<Object> handleConflict(
            RuntimeException ex,
            WebRequest request
    ) {
        String bodyOfResponse = "[ExceptionHandler] ControllerAdvice";
        System.out.println(bodyOfResponse);

        return handleExceptionInternal(
                ex,
                bodyOfResponse,
                new HttpHeaders(),
                HttpStatus.CONFLICT,
                request
        );
    }
}
