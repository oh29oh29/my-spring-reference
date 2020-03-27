package pe.oh29oh29.scheduled.initialdelay.scheduling;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@ConditionalOnProperty(
        prefix = "scheduling",
        name = "mode",
        havingValue = "initial_delay"
)
@Component
public class Task {

    /**
     * Initial Delay
     * <p>
     * Note how we're using both fixedDelay as well as initialDelay in this example.
     * The task will be executed a first time after the initialDelay value – and it will continue to be executed according to the fixedDelay.
     * <p>
     * This option comes handy when the task has a set-up that needs to be completed.
     */
    @Scheduled(fixedDelay = 5_000, initialDelay = 3_000)
    public void scheduleTaskWithInitialDelay() throws InterruptedException {
        log.info("[Scheduled] task with initial delay: " + System.currentTimeMillis() / 1_000);
        Thread.sleep(2_000);
    }

}
