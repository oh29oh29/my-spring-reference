package pe.oh29oh29.scheduled.fixedrate.scheduling;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@ConditionalOnProperty(
        prefix = "scheduling",
        name = "mode",
        havingValue = "fixed_rate"
)
@Component
public class Task {

    /**
     * Fixed Delay
     * <p>
     * This option should be used when each execution of the task is independent.
     * <p>
     * Note that scheduled tasks don't run in parallel by default.
     * So even if we used fixedRate, the next task won't be invoked until the previous one is done.
     */
    @Scheduled(fixedRate = 1_000)
    public void scheduleFixedDelayTask() throws InterruptedException {
        log.info("[Scheduled] Fixed rate task: " + System.currentTimeMillis() / 1000);
        Thread.sleep(2000);
    }

}
