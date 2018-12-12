package com.jc.configBean;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @program: springBootDemo
 * @Date: 2018/12/12 17:37
 * @Author: LiJc
 * @Description:
 */
@Configuration
@PropertySource(value = "classpath:config/common-${spring.profiles.active}.yml")
public class CommonConfig {
    private String filePath;

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
