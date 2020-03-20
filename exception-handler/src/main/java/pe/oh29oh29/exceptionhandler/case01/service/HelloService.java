package pe.oh29oh29.exceptionhandler.case01.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public void hello() {
        throw new NullPointerException();
    }
}
