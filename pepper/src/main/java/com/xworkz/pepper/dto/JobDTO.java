package com.xworkz.pepper.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class JobDTO {

    private String name;
    private long mobile;
    private String email;
    private String address;
    private String collegeName;
    private String degree;
    private String department;

    private int yop;

    private double percentage;
    private String university;
}

