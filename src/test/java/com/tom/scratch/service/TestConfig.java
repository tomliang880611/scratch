package com.tom.scratch.service;

import com.tom.scratch.config.ApplicationConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(ApplicationConfig.class)
@ImportResource("classpath:applicationContext-database.xml")
public class TestConfig {
}
