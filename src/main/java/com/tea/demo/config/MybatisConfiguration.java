package com.tea.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.tea.demo.mapper")
public class MybatisConfiguration {
}
