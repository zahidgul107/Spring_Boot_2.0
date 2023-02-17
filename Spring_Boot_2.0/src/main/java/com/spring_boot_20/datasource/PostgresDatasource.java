package com.spring_boot_20.datasource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;

import com.zaxxer.hikari.HikariDataSource;

public class PostgresDatasource {
	
	@Bean
	@ConfigurationProperties("app.datasource")
	public HikariDataSource hikariDataSourc() {
		return DataSourceBuilder
				.create()
				.type(HikariDataSource.class)
				.build();
	}

}
