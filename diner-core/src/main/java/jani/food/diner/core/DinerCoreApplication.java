package jani.food.diner.core;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "jani.food.diner")
public class DinerCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(DinerCoreApplication.class, args);
    }

}
