package com.cxg.gtd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement  //事务管理
@MapperScan("com.cxg.gtd.dao")
public class GtdApplication {

    public static void main(String[] args) {
        SpringApplication.run(GtdApplication.class, args);
    }

}
