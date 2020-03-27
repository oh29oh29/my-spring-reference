package pe.oh29oh29.scheduled.initialdelay.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@ConditionalOnProperty(
        prefix = "scheduling",
        name = "mode",
        havingValue = "initial_delay"
)
@Configuration
@EnableScheduling
public class SchedulingConfig {
}
