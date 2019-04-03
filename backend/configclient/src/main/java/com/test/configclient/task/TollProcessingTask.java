package com.test.configclient.task;

import org.springframework.boot.CommandLineRunner;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@EnableTask
public class TollProcessingTask implements CommandLineRunner {

    @Override
    public void run(String... strings) throws Exception {
        if(null != strings){
            String stationId = strings[0];
            String licensePlate = strings[1];
            String tx = strings[2];
            System.out.println("Parameter length is "+strings.length);
            System.out.println("Station ID "+ stationId + ",plate is "+licensePlate+",timestap "+tx);
        }
    }
}
