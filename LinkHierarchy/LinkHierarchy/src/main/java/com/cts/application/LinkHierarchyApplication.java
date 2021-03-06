package com.cts.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class, JpaRepositoriesAutoConfiguration.class,
		HibernateJpaAutoConfiguration.class })
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
