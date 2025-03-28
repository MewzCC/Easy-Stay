package com.easystay.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = {"com.easystay"})
@MapperScan(basePackages = {"com.easystay.mappers"})
@EnableScheduling
@EnableTransactionManagement
public class EasyStayWebRunApplication {
    public static void main(String[] args) {
        SpringApplication.run(EasyStayWebRunApplication.class, args);
    }
}
