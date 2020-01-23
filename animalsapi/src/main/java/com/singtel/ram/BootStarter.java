package com.singtel.ram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.singtel.ram","com.singtel.ram.model","com.singtel.ram.model.impl"})
public class BootStarter {

	public static void main(String[] args) {
		SpringApplication.run(BootStarter.class, args);

	}

}
