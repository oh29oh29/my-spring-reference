package pe.oh29oh29.scheduled.fixedrate.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@ConditionalOnProperty(
        prefix = "scheduling",
        name = "mode",
        havingValue = "fixed_rate"
)
@Configuration
@EnableScheduling
public class SchedulingConfig {
}
