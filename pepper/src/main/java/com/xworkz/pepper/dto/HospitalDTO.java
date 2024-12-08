package com.xworkz.pepper.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class HospitalDTO {

    private String name;
    private int age;
    private String address;
    private long mobile;
    private String issue;

}
