package com.xworkz.hen.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Lollipop {

    @Autowired
    @Qualifier("cost")
    private double lollipopCost;
    public Lollipop()
    {
        System.out.println("running Lollipop");
    }
}
