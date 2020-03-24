package pe.oh29oh29.scheduled.fixeddelay.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@ConditionalOnProperty(
        prefix = "scheduling",
        name = "mode",
        havingValue = "fixed_delay"
)
@Configuration
@EnableScheduling
public class SchedulingConfig {
}
