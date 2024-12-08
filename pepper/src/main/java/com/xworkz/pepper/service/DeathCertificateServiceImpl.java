package com.xworkz.pepper.service;

import com.xworkz.pepper.dto.DeathCertificateDTO;
import com.xworkz.pepper.dto.OrganDonationDTO;
import org.springframework.stereotype.Service;

@Service
public class DeathCertificateServiceImpl implements FormService{
    @Override
    public boolean validateAndSave(Object obj) {
        DeathCertificateDTO dto=(DeathCertificateDTO) obj;
        System.out.println(dto.toString());
        return true;
    }
}
