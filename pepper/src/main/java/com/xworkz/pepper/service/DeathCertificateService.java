package com.xworkz.pepper.service;

import com.xworkz.pepper.dto.DeathDTO;

public interface DeathCertificateService {
    boolean validateAndSave(DeathDTO dto);
}
