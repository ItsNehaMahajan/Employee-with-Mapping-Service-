package com.company.Employee.Dao;

import com.company.Employee.Entity.Employee;

import java.util.List;

public interface EmployeeDao {

    List<Employee> findAll();

    Employee save(Employee employee);

    Employee findbyId(int id);

    public Employee merge(Employee emp);

    public void deleteById(int id);


}
