package com.task;

import com.server.WebSocketServer;
import lombok.extern.log4j.Log4j2;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Date;

/**
 * @program: springbootwebsocket
 * @description: websocket定时任务
 * @author: liumingchao
 * @create: 2018-09-11 23:23
 **/
@Component
@Log4j2
public class WebSocketTask {

	@Scheduled(fixedRate = 3 * 1000)
	public void scheduled() {
		log.info("=====>>>>>使用cron  {}", System.currentTimeMillis());
		try {
			WebSocketServer.sendInfo(new Date().toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
