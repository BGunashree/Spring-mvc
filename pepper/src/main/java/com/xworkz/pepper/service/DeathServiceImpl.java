package com.xworkz.pepper.service;

import com.xworkz.pepper.dto.DeathDTO;
import org.springframework.stereotype.Service;

@Service
public class DeathServiceImpl implements DeathCertificateService {

    public DeathServiceImpl() {
        System.out.println("created DeathCertificateServiceImpl");
    }
    @Override
    public boolean validateAndSave(DeathDTO dto) {
        System.out.println("Validating and saving DeathCertificateDto: " + dto);
        return true;
    }
}
