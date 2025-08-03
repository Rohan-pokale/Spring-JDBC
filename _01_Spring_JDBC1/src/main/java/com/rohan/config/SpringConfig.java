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
@ComponentScan(basePackages = {"com.rohan"})
@PropertySource("classpath:application.properties")
public class SpringConfig {

    @Autowired
    Environment environment;
    @Bean
    public JdbcTemplate jdbcTemplate(){
        JdbcTemplate jdbcTemplate=new JdbcTemplate();
        jdbcTemplate.setDataSource(getDataSource());
        return jdbcTemplate;
    }
    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource=new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/college");
        dataSource.setUsername("root");
        dataSource.setPassword("root");

//        dataSource.setDriverClassName(environment.getProperty("DriverClassName"));
//        dataSource.setUrl(environment.getProperty("Url"));
//        dataSource.setUsername(environment.getProperty("Username"));
//        dataSource.setPassword(environment.getProperty("Password"));

        return dataSource;
    }
}
