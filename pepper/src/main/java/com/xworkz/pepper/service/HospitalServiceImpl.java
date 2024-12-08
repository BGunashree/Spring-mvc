package com.xworkz.pepper.service;

import com.xworkz.pepper.dto.HospitalDTO;
import org.springframework.stereotype.Service;

@Service
public class HospitalServiceImpl implements HospitalService{
    @Override
    public boolean validateAndSave(HospitalDTO dto) {

        return true;
    }
}
