package com.brokenmind.guard.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Sanal on 7/8/2017.
 */
@RestController
public class LocationProvider {

    @GetMapping("/getLocation")
    public String getLocation(String user) {
        return "Hello World";
    }
}
