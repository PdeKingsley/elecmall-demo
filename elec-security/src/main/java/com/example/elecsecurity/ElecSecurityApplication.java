package com.example.elecsecurity;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.elecsecurity.dao")
@SpringBootApplication
public class ElecSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElecSecurityApplication.class, args);
    }

}
