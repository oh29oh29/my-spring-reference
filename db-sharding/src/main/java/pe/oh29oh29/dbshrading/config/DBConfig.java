package pe.oh29oh29.dbshrading.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import pe.oh29oh29.dbshrading.config.properties.ShardDBProperties;

@Configuration
@EnableConfigurationProperties(ShardDBProperties.class)
public class DBConfig {

}
