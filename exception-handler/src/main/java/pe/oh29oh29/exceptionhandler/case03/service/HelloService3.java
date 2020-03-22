package pe.oh29oh29.exceptionhandler.case03.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService3 {

    public void hello() {
        throw new ArrayIndexOutOfBoundsException();
    }

    public void hello2() { throw new StringIndexOutOfBoundsException(); }

}
