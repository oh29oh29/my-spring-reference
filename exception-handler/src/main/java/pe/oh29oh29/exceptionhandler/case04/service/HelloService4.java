package pe.oh29oh29.exceptionhandler.case04.service;

import org.springframework.stereotype.Service;
import pe.oh29oh29.exceptionhandler.case04.exception.MyResourceNotFoundException;

@Service
public class HelloService4 {

    public void hello() {
        throw new MyResourceNotFoundException();
    }

}
