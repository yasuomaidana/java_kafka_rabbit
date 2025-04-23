package com.vulpuxmecatroncus.kafka_example.controller;

import com.vulpuxmecatroncus.model.Car;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Home {

    @GetMapping("/")
    public String home() {
        return "Hello, MDF 😈!";
    }

    @GetMapping("/car")
    public Car car() {
        return new Car("Tesla", "Red");
    }
}
