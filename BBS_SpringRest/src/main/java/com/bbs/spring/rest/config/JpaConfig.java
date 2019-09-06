package com.bbs.spring.rest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

	@Configuration
	@ComponentScan(basePackages="com.bbs")
	public class JpaConfig {
		
		@Bean
		public LocalEntityManagerFactoryBean entityManagerFactoryBean() {
			LocalEntityManagerFactoryBean emfb = new LocalEntityManagerFactoryBean();
			emfb.setPersistenceUnitName("myPersistanceUnit");
			return emfb;
		}

	}

