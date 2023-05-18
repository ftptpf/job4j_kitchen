package ru.job4j.kitchen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KitchenApplication {

    public static void main(String[] args) {
        SpringApplication.run(KitchenApplication.class, args);
        System.out.println("REST API Kitchen service ready for work!");
    }

}
