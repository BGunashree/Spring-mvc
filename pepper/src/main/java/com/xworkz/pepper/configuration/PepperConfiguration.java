package com.xworkz.pepper.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.xworkz.pepper")
@EnableWebMvc
public class PepperConfiguration {

    public PepperConfiguration()
    {
        System.out.println("running PepperConfiguration");
    }
}
