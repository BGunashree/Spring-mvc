package com.xworkz.pepper.component;

import com.xworkz.pepper.dto.DeathDTO;
import com.xworkz.pepper.service.DeathCertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DeathCertificateController {

    @Autowired
    DeathCertificateService service;

    DeathCertificateController(){
        System.out.println("created DeathCertificateController");
    }

    @RequestMapping("/decease")
    public String onSave(DeathDTO dto){
        System.out.println("DeathCertificateDto:"+dto.toString());
        boolean saved=service.validateAndSave(dto);
        if(saved){
            System.out.println("data is saved");
        }
        else {
            System.out.println("not saved");
        }

        return "Meghi.jsp";
    }
}
