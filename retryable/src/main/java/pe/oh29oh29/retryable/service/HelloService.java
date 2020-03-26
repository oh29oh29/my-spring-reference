package pe.oh29oh29.retryable.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class HelloService {

    @Retryable(value = NullPointerException.class, maxAttempts = 3, backoff = @Backoff(delay = 1_000))
    public void retryableTask() {
        log.info("[Retryable] task start");
        throw new NullPointerException();
    }
}
