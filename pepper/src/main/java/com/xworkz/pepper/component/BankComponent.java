package com.xworkz.pepper.component;

import com.xworkz.pepper.dto.BankAccDTO;
import com.xworkz.pepper.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BankComponent {

    @Autowired
    private BankService bank;
    public  BankComponent()
    {
        System.out.println("running BankComponent");
    }

    @RequestMapping("/create")
    public String onCreate(BankAccDTO dto)
    {

        System.out.println(dto.toString());
        if(this.bank.validateAndSave(dto))
        {
            System.out.println("valid");
        }
        else {
            System.out.println("invalid");
        }
        return "Bank.jsp";
    }
}
