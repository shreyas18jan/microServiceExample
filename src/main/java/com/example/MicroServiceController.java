package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Let the SpringBoot assume the Configurations.
@EnableAutoConfiguration
public class MicroServiceController {

    public static void main(String[] args) throws Exception {
        // This command will start the auto-configured Tomcat web server.
        SpringApplication.run(MicroServiceController.class, args);
    }

}
