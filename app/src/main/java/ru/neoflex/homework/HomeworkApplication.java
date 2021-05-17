package ru.neoflex.homework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.neoflex.Utils;


@SpringBootApplication
public class HomeworkApplication {

    public static void main(String[] args) {
        Utils utils = new Utils();
        SpringApplication.run(HomeworkApplication.class, args);
        utils.showMessage();
    }
}
