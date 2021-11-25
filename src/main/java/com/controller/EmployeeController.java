package com.controller;

import com.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @GetMapping("/showForm")
    public String showForm(ModelMap model){
        model.addAttribute("employee", new Employee());
        return "create";
    }
    @PostMapping("/info")
    public String info(Employee employee, Model modelMap){
        modelMap.addAttribute("employee", employee);
        return "info";
    }
}
