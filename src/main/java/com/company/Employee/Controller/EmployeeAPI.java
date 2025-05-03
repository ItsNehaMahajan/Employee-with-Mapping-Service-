package com.company.Employee.Controller;


import com.company.Employee.Entity.Employee;
import com.company.Employee.Service.EmployeeService;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeAPI {

    Employee employee;
    EmployeeService theemployeeservice;

    public EmployeeAPI(EmployeeService theemployeeservice) {

        this.theemployeeservice = theemployeeservice;
    }

    @GetMapping("/Employee")
    public List<Employee> findAll() {
        return theemployeeservice.findAll();
    }


    @GetMapping("/Employee/{id}")
    public Employee findbyId(@PathVariable int id) {
        Employee emp = theemployeeservice.findbyId(id);
        return emp;
    }


    @PostMapping("/Employee")
    public void save(@RequestBody Employee emp) {
        theemployeeservice.save(emp);

    }

    @PutMapping("/Employee")
    public void update(@RequestBody Employee emp) {

        theemployeeservice.merge(emp);
    }

    @DeleteMapping("/Employee/{id}")
    public void delete(@PathVariable int id) {
        theemployeeservice.deleteById(id);
    }


}