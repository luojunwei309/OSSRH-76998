package com.ljw.bs;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author: ljw
 * @create: 2021-12-24 10:56
 **/
@ConfigurationProperties(prefix = "com.ljw")
public class DemoProperties {
    private String version;
    private String name;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
