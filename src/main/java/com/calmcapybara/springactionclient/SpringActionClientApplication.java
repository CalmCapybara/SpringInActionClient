package com.calmcapybara.springactionclient;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class SpringActionClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringActionClientApplication.class, args);
    }

}
