package com.xworkz.pepper.service;

import com.xworkz.pepper.dto.JobDTO;
import com.xworkz.pepper.dto.MatrimonyDTO;
import org.springframework.stereotype.Service;

@Service
public class MatrimonyServiceImpl implements FormService{
    @Override
    public boolean validateAndSave(Object obj) {
        MatrimonyDTO dto=(MatrimonyDTO)obj;
        System.out.println(dto.toString());
        return true;
    }
}
