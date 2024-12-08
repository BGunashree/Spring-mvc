package com.xworkz.pepper.service;

import com.xworkz.pepper.dto.JobDTO;
import org.springframework.stereotype.Service;

@Service
public class JobServiceImpl implements FormService{
    @Override
    public boolean validateAndSave(Object obj) {

        JobDTO dto=(JobDTO)obj;

        return true;
    }
}
