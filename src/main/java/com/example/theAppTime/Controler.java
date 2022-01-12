package com.example.theAppTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Controller
public class Controler {
    @RestController
    @RequestMapping("/mydata")
    public class ComplainControler {
        @GetMapping("")
        public String StringgetComplaints(){
            return "Welcome to app";
        }

    }
}
