package com.example.doanduytrungluong.repository;

import com.example.doanduytrungluong.entity.EmployeesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeesRepo extends JpaRepository<EmployeesEntity, Integer> {

}
