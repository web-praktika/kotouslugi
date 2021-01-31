package ru.praktika.kotouslugi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"ru.praktika"})
public class KotouslugiApplication {

    public static void main(String[] args) {
        SpringApplication.run(KotouslugiApplication.class, args);
    }

}
