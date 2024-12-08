package com.xworkz.pepper.component;

import com.xworkz.pepper.dto.*;
import com.xworkz.pepper.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PepperComponent {

    @Qualifier("jobServiceImpl")
    @Autowired
    private FormService jobService;
    @Qualifier("matrimonyServiceImpl")
    @Autowired
    private FormService matrimonyService;
    @Qualifier("hotelServiceImpl")
    @Autowired
    private FormService hotelService;
    @Qualifier("scholarshipServiceImpl")
    @Autowired
    private FormService scholarshipService;
    @Qualifier("organDonationImpl")
    @Autowired
    private FormService organDonationService;
    @Qualifier("deathCertificateServiceImpl")
    @Autowired
    private FormService deathCertificateService;
    public PepperComponent()
    {
        System.out.println("running PepperComponent");
    }

    @RequestMapping("/book")
    public String onBook(HotelDTO dto)
    {
        System.out.println("running onBook");
        if(this.hotelService.validateAndSave(dto))
        {
            System.out.println("valid");
        }
        else
        {
            System.out.println("invalid");
        }
        return "HotelRoomBooking.jsp";
    }
    @RequestMapping("/deceased")
    public String onDeceased(DeathCertificateDTO dto)
    {
        System.out.println("running onBook");
        if(this.deathCertificateService.validateAndSave(dto))
        {
            System.out.println("valid");
        }
        else
        {
            System.out.println("invalid");
        }
        return "DeathCertificate.jsp";
    }
    @RequestMapping("/apply")
    public String onApply(ScholarshipDTO dto)
    {
        System.out.println("running onApply");
        if(this.scholarshipService.validateAndSave(dto))
        {
            System.out.println("valid");
        }
        else
        {
            System.out.println("invalid");
        }
        return "Scholarship.jsp";
    }

    @RequestMapping("/matrimony")
    public String onApply(MatrimonyDTO dto)
    {
        System.out.println("running matrimony");
        if(this.matrimonyService.validateAndSave(dto))
        {
            System.out.println("valid");
        }
        else
        {
            System.out.println("invalid");
        }
        return "Matrimony.jsp";
    }

    @RequestMapping("/organ")
    public String onRegistering(OrganDonationDTO dto)
    {
        System.out.println("running matOrganDonation");
        if(this.organDonationService.validateAndSave(dto))
        {
            System.out.println("valid");
        }
        else
        {
            System.out.println("invalid");
        }
        return "OrganDonation.jsp";
    }

    @RequestMapping("/job")
    public String onJobApplication(JobDTO dto)
    {

        System.out.println("running onJobApplication");
        System.out.println(dto.toString());
        if(this.jobService.validateAndSave(dto))
        {
            System.out.println("valid");
        }
        else
        {
            System.out.println("invalid");
        }
        return "Job.jsp";
    }
}
