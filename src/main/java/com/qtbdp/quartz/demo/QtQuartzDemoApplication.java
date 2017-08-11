package com.qtbdp.quartz.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.qtbdp.quartz.demo")
@MapperScan("com.qtbdp.quartz.demo.mapper")
@SpringBootApplication
public class QtQuartzDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(QtQuartzDemoApplication.class, args);
	}
}
