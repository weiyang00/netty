package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * Spring Boot 应用启动类
 *
 * Created by bysocket on 16/4/26.
 */
// Spring Boot 应用的标识
@SpringBootApplication
// mapper 接口类扫描包配置
@MapperScan("com.example.springbootdemo.dao")
@EnableCaching // 启动缓存
public class Application {

	public static void main(String[] args) {
		// 程序启动入口
		// 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
		SpringApplication.run(Application.class,args);
	}
}
