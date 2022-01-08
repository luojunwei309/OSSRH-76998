package com.ljw.bs;

import com.ljw.demo.module.DemoModule;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: ljw
 * @create: 2021-12-24 10:58
 **/
@Configuration
@EnableConfigurationProperties(DemoProperties.class)
public class DemoAutoConfiguration {

    @Bean
    public DemoModule demoModule(DemoProperties demoProperties){
        DemoModule demoModule = new DemoModule();
        demoModule.setName(demoProperties.getName());
        demoModule.setVersion(demoProperties.getVersion());
        return demoModule;
    }

}
