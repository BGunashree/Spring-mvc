package com.xworkz.pepper.service;

import com.xworkz.pepper.dto.BankAccDTO;
import org.springframework.stereotype.Service;

@Service
public class BankServiceImpl implements BankService{
    @Override
    public boolean validateAndSave(BankAccDTO dto) {


        return true;
    }
}
