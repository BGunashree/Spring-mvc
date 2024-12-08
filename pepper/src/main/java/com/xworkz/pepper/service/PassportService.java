package com.xworkz.pepper.service;

import com.xworkz.pepper.dto.PassportDTO;

public interface PassportService {
    boolean validateAndSave(PassportDTO dto);
}
