package com.test.secureservice.controller;

import com.test.secureservice.model.TollUsage;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
@EnableResourceServer
public class TaskController {

    @GetMapping("/tolldata")
    public ArrayList<TollUsage> getTollData(){

        ArrayList<TollUsage> tolls =new ArrayList<TollUsage>(Arrays.asList(
                new TollUsage("100","station150","wfaws","2019-04-01T06:31:22"),
                new TollUsage("100","station150","wfaws","2019-04-01T06:31:22")
        ));

        return tolls;

    }
}
