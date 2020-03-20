package pe.oh29oh29.exceptionhandler.case01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.oh29oh29.exceptionhandler.case01.service.HelloService;

@Controller
@RequestMapping("/case01")
public class HelloController {

    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping
    public void hello() {
        helloService.hello();
    }

    /**
     * the @ExceptionHandler annotated method is only active for that particular Controller, not globally for the entire application.
     * Of course, adding this to every controller makes it not well suited for a general exception handling mechanism.
     */
    @ExceptionHandler(NullPointerException.class)
    public void handleException() {
        System.out.println("[ExceptionHandler] NullPointerException handling");
    }

}
