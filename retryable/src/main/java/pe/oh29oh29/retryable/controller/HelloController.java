package pe.oh29oh29.retryable.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.oh29oh29.retryable.service.HelloService;

@Controller
@RequestMapping("/")
public class HelloController {

    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping
    public void hello() {
        helloService.retryableTask();
    }

}
