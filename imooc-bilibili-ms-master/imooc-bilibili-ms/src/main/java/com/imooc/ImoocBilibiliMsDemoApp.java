package com.imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ImoocBilibiliMsDemoApp {

    public static void main(String[] args){
        ApplicationContext app = SpringApplication.run(ImoocBilibiliMsDemoApp.class, args);
    }
}
