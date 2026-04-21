package com.re.session12_bai1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Session12Bai1Application {

    public static void main(String[] args) {

        System.out.println("Hospital Web Service is ready on Embedded Tomcat!");

        SpringApplication.run(Session12Bai1Application.class, args);
    }

}
