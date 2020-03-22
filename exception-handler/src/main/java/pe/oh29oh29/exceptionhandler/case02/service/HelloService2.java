package pe.oh29oh29.exceptionhandler.case02.service;

import org.springframework.stereotype.Service;
import pe.oh29oh29.exceptionhandler.case02.exception.MyResourceNotFoundException;

@Service
public class HelloService2 {

    public void hello() {
        throw new MyResourceNotFoundException();
    }

    public void hello2() {
        throw new IllegalArgumentException();
    }
}
