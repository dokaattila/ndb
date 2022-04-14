package com.da.nbd;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Configuration;


import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


@Configuration
public class ConnectionData {

    @PostConstruct
    public Connection getDataSource() {
        try {
        Connection conn = DriverManager.getConnection("jdbc:sqlite:src/main/resources/namedays.db");
        return conn;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }




}
