package com.example.doanduytrungluong.controller;

import com.example.doanduytrungluong.entity.EmployeesEntity;
import com.example.doanduytrungluong.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class WebController {
    @Autowired
    EmployeesService employeesService;

    @GetMapping({"/", "/index"})
    @ModelAttribute
    public String index(Model model) {
        String msg = "Hello Spring Boot + JSP";
        model.addAttribute("msg", msg);
        List<EmployeesEntity> employees = employeesService.findAllEmployees();
        model.addAttribute("employees", employees);
        return "index";
    }
    @GetMapping({"/create"})
    public String create(){
        return "create";
    }
    @PostMapping({"/create"})
    public String addEmployee(EmployeesEntity e){
        employeesService.createEmployee(e);
        return "redirect:/index";
    }
}
