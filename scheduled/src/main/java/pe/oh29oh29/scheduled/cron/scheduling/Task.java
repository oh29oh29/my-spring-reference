package pe.oh29oh29.scheduled.cron.scheduling;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@ConditionalOnProperty(
        prefix = "scheduling",
        name = "mode",
        havingValue = "cron"
)
@Component
public class Task {

    /**
     * Fixed Delay
     * <p>
     * In this case, the duration between the end of last execution and the start of next execution is fixed.
     * The task always waits until the previous one is finished.
     * <p>
     * This option should be used when it’s mandatory that the previous execution is completed before running again.
     */
    @Scheduled(fixedDelay = 5_000)
    public void scheduleFixedDelayTask() throws InterruptedException {
        log.info("[Scheduled] Fixed delay task: " + System.currentTimeMillis() / 1_000);
        Thread.sleep(2_000);
    }

}
