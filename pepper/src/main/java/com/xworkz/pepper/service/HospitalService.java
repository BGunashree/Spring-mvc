package com.xworkz.pepper.service;

import com.xworkz.pepper.dto.HospitalDTO;

public interface HospitalService {

    boolean validateAndSave(HospitalDTO dto);
}
