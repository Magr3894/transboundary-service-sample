package com.transample;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.transample.dao.mapper") //扫描的mapper
@SpringBootApplication
public class TransampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(TransampleApplication.class, args);
    }
}