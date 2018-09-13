package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @program: springbootwebsocket
 * @description: springboot项目启动类
 * @author: liumingchao
 * @create: 2018-09-11 21:55
 **/
@SpringBootApplication
@ComponentScan(basePackages = "com.*")
@EnableScheduling
public class StartUpApplication {


	public static void main(String[] args) {
		SpringApplication.run(StartUpApplication.class, args);
	}
}

