package com.cts.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.cts")//package
@EntityScan("com.cts")
public class LinkHierarchyApplication {

	public static void main(String[] args) {

		SpringApplication.run(LinkHierarchyApplication.class, args);
		/*-Sets up default configuration
		-sets spring application context
		-performs class path scan
		-starts tomcat server*/

	}

}
