package com.xworkz.pepper.service;

import com.xworkz.pepper.dto.JobDTO;
import com.xworkz.pepper.dto.ScholarshipDTO;
import org.springframework.stereotype.Service;

@Service
public class ScholarshipServiceImpl  implements FormService{
    @Override
    public boolean validateAndSave(Object obj) {

        ScholarshipDTO dto=(ScholarshipDTO)obj;
        System.out.println(dto.toString());
        return true;
    }
}
