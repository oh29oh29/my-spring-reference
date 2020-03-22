package pe.oh29oh29.exceptionhandler.case03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.oh29oh29.exceptionhandler.case03.service.HelloService3;

@Controller
@RequestMapping("/case03")
public class HelloController3 {

    private final HelloService3 helloService3;

    public HelloController3(HelloService3 helloService3) {
        this.helloService3 = helloService3;
    }

    @GetMapping
    public void hello() {
        helloService3.hello();
    }

}