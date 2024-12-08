package com.xworkz.pepper.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.Date;

@Data
@NoArgsConstructor
public class DeathCertificateDTO {


    private String name;
    private int age;
    private String address;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dob;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dod;
    private String causeOfDeath;


}
