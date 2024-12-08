package com.xworkz.pepper.service;

import com.xworkz.pepper.dto.BankAccDTO;

public interface BankService {

    boolean validateAndSave(BankAccDTO dto);
}
