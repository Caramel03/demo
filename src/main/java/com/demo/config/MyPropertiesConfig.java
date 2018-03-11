package com.demo.config;

import com.demo.entity.Girl;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(Girl.class)
public class MyPropertiesConfig {
}
