package view;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.ShowTime;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("/service");

        System.out.println("\tCurrent time:");
        context.getBean(ShowTime.class);
    }
}
