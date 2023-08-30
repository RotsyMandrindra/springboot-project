package com.example.finalexam.repository;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
@Getter
@Setter
public class DatabaseConfiguration {

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @Value("${spring.datasource.url}")
    private String url;

    @Bean
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
                url,
                username,
                password
        );
    }
}
