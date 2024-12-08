package com.xworkz.pepper.service;

import com.xworkz.pepper.dto.HotelDTO;
import org.springframework.stereotype.Service;

@Service
public class HotelServiceImpl implements FormService{
    @Override
    public boolean validateAndSave(Object obj) {

        HotelDTO dto=(HotelDTO) obj;
        System.out.println(dto.toString());
        return true;
    }
}
