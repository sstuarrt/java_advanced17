package com.spring.springdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(SpringDataJpaApplication.class, args);

        UniversityService service = ctx.getBean(UniversityService.class);

        University university = new University();
        university.setCreditLevel(5);
        university.setNumberOfStudents(7500);

        System.out.println(service.findByName((String)"NULP"));

        System.out.println(service.findByAddress("University 13"));

        service.deleteById((long)3);

        service.countByNumberOfStudents(2350 + 750);
    }
}
