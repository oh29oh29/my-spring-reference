package pe.oh29oh29.exceptionhandler.case02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.oh29oh29.exceptionhandler.case02.service.HelloService2;

@Controller
@RequestMapping("/case02")
public class HelloController2 {

    private final HelloService2 helloService2;

    public HelloController2(HelloService2 helloService2) {
        this.helloService2 = helloService2;
    }

    @GetMapping
    public void hello() {
        helloService2.hello();
    }

    @GetMapping("/2")
    public void hello2() {
        helloService2.hello2();
    }
}