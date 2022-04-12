package com.da.nbd;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Configuration;


import javax.annotation.PostConstruct;
import javax.sql.DataSource;


@Configuration
public class ConnectionData {

    @PostConstruct
    public DataSource getDataSource() {
        return DataSourceBuilder
                .create()
                .url(System.getenv("URL"))
                .username(System.getenv("USERNAME"))
                .password(System.getenv("PASSWORD"))
                .build();
    }

}
