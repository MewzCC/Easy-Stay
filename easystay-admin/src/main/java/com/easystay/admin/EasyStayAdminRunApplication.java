package com.easystay.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.easystay"})
@MapperScan(basePackages = {"com.easystay.mappers"})
public class EasyStayAdminRunApplication {
    public static void main(String[] args) {
        SpringApplication.run(EasyStayAdminRunApplication.class, args);
    }
}
