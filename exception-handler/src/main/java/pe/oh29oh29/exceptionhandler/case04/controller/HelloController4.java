package pe.oh29oh29.exceptionhandler.case04.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.server.ResponseStatusException;
import pe.oh29oh29.exceptionhandler.case04.exception.MyResourceNotFoundException;
import pe.oh29oh29.exceptionhandler.case04.service.HelloService4;

@Controller
@RequestMapping("/case04")
public class HelloController4 {

    private final HelloService4 helloService4;

    public HelloController4(HelloService4 helloService4) {
        this.helloService4 = helloService4;
    }

    /**
     * ResponseStatusException
     * <p>
     * Spring 5 introduced the ResponseStatusException class.
     * We can create an instance of it providing an HttpStatus and optionally a reason  and a cause:
     * <p>
     * What are the benefits of using ResponseStatusException?
     * <p>
     * Excellent for prototyping: We can implement a basic solution quite fast
     * One type, multiple status codes: One exception type can lead to multiple different responses. This reduces tight coupling compared to the @ExceptionHandler
     * We won't have to create as many custom exception classes
     * More control over exception handling since the exceptions can be created programmatically
     * <p>
     * And what about the tradeoffs?
     * <p>
     * There's no unified way of exception handling: It's more difficult to enforce some application-wide conventions, as opposed to @ControllerAdvice which provides a global approach
     * Code duplication: We may find ourselves replicating code in multiple controllers
     */
    @GetMapping
    public void hello() {
        try {
            helloService4.hello();
        } catch (MyResourceNotFoundException ex) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND,
                    "Hello Not Found",
                    ex
            );
        }
    }

}