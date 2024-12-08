package com.xworkz.pepper.component;

import com.xworkz.pepper.dto.PassportDTO;
import com.xworkz.pepper.service.PassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PassportController {

    @Autowired
    private PassportService service;

    PassportController(){
        System.out.println("created PassportController");
    }

    @RequestMapping("/passport")
    public String onSave(PassportDTO dto){
        System.out.println("Passport Dto:"+dto);
        boolean saved=service.validateAndSave(dto);
        if(saved){
            System.out.println("data is saved");
        }
        else {
            System.out.println("data is not saved");
        }
        return "Passport.jsp";
    }

}
