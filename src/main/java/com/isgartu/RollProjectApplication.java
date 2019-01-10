package com.isgartu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages="com.isgartu")
@SpringBootApplication
public class RollProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(RollProjectApplication.class, args);
	}

}

