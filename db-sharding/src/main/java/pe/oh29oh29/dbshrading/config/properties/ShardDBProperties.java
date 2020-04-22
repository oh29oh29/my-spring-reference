package pe.oh29oh29.dbshrading.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@Data

@ConfigurationProperties(prefix = "shard")
public class ShardDBProperties {

    private String driverClassName;
    private List<String> names;
    private List<String> urls;
    private String column;
    private List<String> tables;
    private List<String> usernames;
    private List<String> password;
    private int maxActive;
    private int minIdle;
    private String scanPackage;
    private String poolName;

    private boolean autoReconnect = true;
    private boolean cacheServerConfiguration = true;
    private boolean useLocalSessionState = true;
    private boolean elideSetAutoCommits = true;
    private int connectTimeout = 3_000;
    private int socketTimeout = 60_000;
    private boolean useSSL = false;
    private boolean useAffectedRows = true;
    private boolean useUnicode = true;
    private String characterEncoding = "UTF-8";
}
