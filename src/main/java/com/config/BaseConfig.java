package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * @program: springbootwebsocket
 * @description: 项目基本配置
 * @author: liumingchao
 * @create: 2018-09-11 22:09
 **/
@Configuration
public class BaseConfig {


	@Bean
	public ServerEndpointExporter serverEndpointExporter() {
		return new ServerEndpointExporter();
	}




}
