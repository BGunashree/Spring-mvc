package com.xworkz.pepper.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;


@Data
@NoArgsConstructor
public class OrganDonationDTO {
    private String name;
    private long mobile;
    private String email;
    private String bloodGroup;
    private String address;
    private String age;
    private String gender;

    private String organ;

    private String date;
    private String tissue;
}
