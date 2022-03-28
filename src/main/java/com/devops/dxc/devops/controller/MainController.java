package com.devops.dxc.devops.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

import com.devops.dxc.devops.model.User;
import com.devops.dxc.devops.model.Util;

@SpringBootApplication
@EnableAutoConfiguration
@Controller
public class MainController {
<<<<<<< HEAD
     
    Logger logger = LoggerFactory.getLogger(MainController.class);
=======
>>>>>>> b6600376837a518de7fc548fa1c5d4e1c6d3b837

    @GetMapping("/register")
    public String showForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);

        List<String> listProfession = Arrays.asList("Developer", "Tester", "Architect");
        model.addAttribute("listProfession", listProfession);

        return "register_form";
    }

    private float impu;

    @PostMapping("/register")
    public String submitForm(@ModelAttribute("user") User user) {
<<<<<<< HEAD
    	
        if (null!=user ){
            Util util = new Util();
            logger.info(user.toString());
            
            user.setDiezxciento(util.getDxc(user.getAhorro()));
            user.setSaldo(user.getAhorro()-user.getDiezxciento());
            
            impu=util.impuesto(user.getSueldo());
            user.setImpuesto(impu);
            return "register_success";

        }else{
            return "error";
        }
       
=======
        System.out.println(user);

        user.setDiezxciento(Util.getDxc(user.ahorro, user.sueldo));
        user.setSaldo(user.ahorro - user.diezxciento);

        /* impu=Util.getDxc(user.ahorro,user.sueldo); */
        impu = Util.impuesto(user.sueldo);
        user.setImpuesto(impu);
        return "register_success";
>>>>>>> b6600376837a518de7fc548fa1c5d4e1c6d3b837
    }

}