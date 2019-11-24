package com.zxs.secretkeymanagement;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.snc.secretkeymanagement.mapper")
public class SecretkeymanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecretkeymanagementApplication.class, args);
	}

}
