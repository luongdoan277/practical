package com.example.doanduytrungluong.service;

import com.example.doanduytrungluong.entity.EmployeesEntity;

import java.util.List;

public interface EmployeesService {
    List<EmployeesEntity> findAllEmployees();
    EmployeesEntity createEmployee(EmployeesEntity e);
}
