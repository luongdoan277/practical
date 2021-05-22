package com.example.doanduytrungluong.service;

import com.example.doanduytrungluong.entity.EmployeesEntity;
import com.example.doanduytrungluong.repository.EmployeesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeesServiceImpl implements EmployeesService {

    @Autowired
    EmployeesRepo employeesRepo;

    @Override
    public List<EmployeesEntity> findAllEmployees() {
        return employeesRepo.findAll();
    }

    @Override
    public EmployeesEntity createEmployee(EmployeesEntity e) {
        return employeesRepo.save(e);
    }
}
