package com.example.backend.infrastructure.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.example.backend.adaptor.out.persistence.*.mapper")
public class MybatisConfig {

}
