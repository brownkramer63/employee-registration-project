package com.cydeo.Controller;

import com.cydeo.bootstrap.DataGenerator;
import com.cydeo.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //will auto create bean
@RequestMapping("/employee")//all methods will start with this endpoint
public class EmployeeController {

    @GetMapping("/register")//so when we put in employee register in url it will return the return below
    public String createEmployee(Model model){

        model.addAttribute("employee", new Employee());
        model.addAttribute("stateList", DataGenerator.getAllStates());



        return "employee/employee-create";
    }



}
