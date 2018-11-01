package com.product.config;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class JobComponent {

	@Autowired
	private FileConfig fileConfig;

	//@Scheduled(cron = "0 0 0 * * ?")
	public void timerToNow() {
		
	}

}