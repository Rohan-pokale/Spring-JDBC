package com.rohan.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "com.rohan")
@PropertySource("classpath:application.properties")
public class spring_cofig {

    @Autowired
    Environment environment;

    @Bean
    public JdbcTemplate jdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource driverManagerDataSource= new DriverManagerDataSource();

//        driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/practicedb");
//        driverManagerDataSource.setUsername("root");
//        driverManagerDataSource.setPassword("Root@123");

        driverManagerDataSource.setDriverClassName(environment.getProperty("mysql.driver.class.name"));
        driverManagerDataSource.setUrl(environment.getProperty("mysql.url"));
        driverManagerDataSource.setUsername(environment.getProperty("mysql.username"));
        driverManagerDataSource.setPassword(environment.getProperty("mysql.password"));

        return driverManagerDataSource;

    }
}
