package com.kavinda.rentacar.demoapplication.controller;

import com.kavinda.rentacar.demoapplication.model.Student;
import com.kavinda.rentacar.demoapplication.servicer.StudentService;
import com.kavinda.rentacar.demoapplication.servicer.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController //define as the controller
public class MainController {

    @Autowired
    StudentServiceImpl studentServiceImpl;
//Only works for get method
    //RequestMapping - mapping the url to this method(if someone call this url it will come here)
    @RequestMapping(value="/hello" , method= RequestMethod.GET) //specifying the method type
    public String greeting(){
        return ("Hello SpringBoot By Get Method");
    }

    //only works for the post method
    @RequestMapping(value="/hello" , method= RequestMethod.POST) //specifying the method type
    public String greeting2(){
        return ("Hello SpringBoot By Post Method");
    }

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public Student save(@RequestBody Student student) {
        return studentServiceImpl.save(student);
    }
}
