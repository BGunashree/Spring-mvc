package com.xworkz.pepper.component;

import com.xworkz.pepper.dto.HospitalDTO;
import com.xworkz.pepper.dto.HotelDTO;
import com.xworkz.pepper.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HospitalComponent {

    @Autowired
   private HospitalService hospital;
    public HospitalComponent()
    {
        System.out.println("running HospitalComponent");
    }

    @RequestMapping("/admit")
    public String onAdmit(HospitalDTO dto)
    {

        System.out.println("running Hosiptal");
        System.out.println(dto.toString());
        if(this.hospital.validateAndSave(dto))
        {
            System.out.println("valid");
        }
        else
        {
            System.out.println("invalid");
        }
        return "Hospital.jsp";
    }
}
