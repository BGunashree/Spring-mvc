package com.xworkz.pepper.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ScholarshipDTO {

    private String name;
    private long mobile;
    private String email;
    private String collegeName;

    private String branch;
}
