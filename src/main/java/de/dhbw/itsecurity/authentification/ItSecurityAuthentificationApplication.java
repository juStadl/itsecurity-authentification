package de.dhbw.itsecurity.authentification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class ItSecurityAuthentificationApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItSecurityAuthentificationApplication.class, args);
    }

}
