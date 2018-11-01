package com.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableScheduling
@EnableTransactionManagement
@ServletComponentScan
@MapperScan("com.product.dao")
@SpringBootApplication
public class BootdoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootdoApplication.class, args);
		System.out.println("启动成功");
	}

}
