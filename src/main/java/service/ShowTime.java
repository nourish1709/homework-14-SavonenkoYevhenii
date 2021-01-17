package service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ShowTime {
    @Scheduled(cron = "*/1 * * * * *")
    public void showTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("\t\tHH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
    }
}
