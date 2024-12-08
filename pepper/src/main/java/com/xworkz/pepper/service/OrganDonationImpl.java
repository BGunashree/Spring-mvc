package com.xworkz.pepper.service;

import com.xworkz.pepper.dto.JobDTO;
import com.xworkz.pepper.dto.OrganDonationDTO;
import org.springframework.stereotype.Service;

@Service
public class OrganDonationImpl implements FormService {
    @Override
    public boolean validateAndSave(Object obj) {
       OrganDonationDTO dto=(OrganDonationDTO) obj;
        System.out.println(dto.toString());
        return true;
    }
}
