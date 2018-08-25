package com.example.Server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@SpringBootApplication
public class ServerApplication {


    private static Logger log = LoggerFactory.getLogger(ServerApplication.class);

    @RequestMapping(value = "/")
    public String home() {
        log.info("accssing home");
        return "Hi!";
    }

    @RequestMapping(value = "/random")
    public String getRandom() {
        log.info("Access /getRandom API");

        Random rand = new Random();

        int randomNum = rand.nextInt(10);
        return "Random Number from Server is "+randomNum;
    }

    public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}
}
