package org.example.studyspringbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudySpringBootDemoApplication {

    public static void main(String[] args) {
        System.out.println("Spring Boot Application Starting...");
        SpringApplication.run(StudySpringBootDemoApplication.class, args);
    }

}
