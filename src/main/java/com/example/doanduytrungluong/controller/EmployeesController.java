package com.example.doanduytrungluong.controller;

import com.example.doanduytrungluong.entity.EmployeesEntity;
import com.example.doanduytrungluong.model.BaseResponse;
import com.example.doanduytrungluong.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
public class EmployeesController {

    @Autowired
    EmployeesService employeesService;

    @GetMapping
    public ResponseEntity findAllEmployee(){
        BaseResponse res = new BaseResponse();
        res.data = employeesService.findAllEmployees();
        return ResponseEntity.ok(res);
    }
    @PostMapping
    public ResponseEntity createEmployee(@RequestBody EmployeesEntity e){
        BaseResponse res = new BaseResponse();
        res.data = employeesService.createEmployee(e);
        return ResponseEntity.ok(res);
    }
}
