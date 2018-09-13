package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: springbootwebsocket
 * @description: webSocket测试控制层类
 * @author: liumingchao
 * @create: 2018-09-11 22:08
 **/
@Controller
public class MyController {

	@RequestMapping("")
	public String index() {
		return "index";
	}
}
