package com.zxl.blog;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class BlogApplicationTests {

    @Autowired
    DataSource dataSource;

    public static Logger logger = LoggerFactory.getLogger(BlogApplication.class);

    @Test
    public void contextLoads() throws SQLException {
        System.out.println(dataSource.getConnection());
    }

}
