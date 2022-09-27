package com.cydeo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //will auto create bean
@RequestMapping("employee")//all methods will start with this endpoint
public class EmployeeController {

    @GetMapping("/register")//so when we put in employee register in url it will return the return below
    public String createEmployee(){
        return "employee/employee-create";
    }



}
