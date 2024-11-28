package com.xworkz.hen.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com.xworkz.hen")
public class HenConfiguration {

    public HenConfiguration()
    {
        System.out.println("running HenConfiguration");
    }

    @Bean
    public double cost()
    {
        System.out.println("running cost method");
        return 180.0;
    }

    @Bean
    public double weight()
    {
        System.out.println("running weight method");
        return 1.5;
    }
}
