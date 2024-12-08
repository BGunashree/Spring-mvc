package com.xworkz.pepper.service;

import com.xworkz.pepper.dto.PassportDTO;
import org.springframework.stereotype.Service;

@Service
public class PassportServiceImpl implements PassportService{

    PassportServiceImpl(){
        System.out.println("created PassportServiceImpl");
    }
    @Override
    public boolean validateAndSave(PassportDTO dto) {

        System.out.println("validating and saving passport dto:"+dto);
        return true;
    }
}
