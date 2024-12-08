package com.xworkz.pepper.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MatrimonyDTO {

    private String name;
    private long mobile;
    private String email;
    private String city;
    private String state;
    private String gender;
    private String religion;

    private int age;

    private String occupation;
    private String qualification;
}
