package com.gcu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication//(exclude =  {DataSourceAutoConfiguration.class })
@ComponentScan({"com.gcu"})
public class Cst323ActivityApplication {

	public static void main(String[] args) {
		SpringApplication.run(Cst323ActivityApplication.class, args);
	}

}