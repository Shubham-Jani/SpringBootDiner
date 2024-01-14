package jani.food.diner.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "jani.food.diner")
public class DinerWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(DinerWebApplication.class, args);
    }

}
