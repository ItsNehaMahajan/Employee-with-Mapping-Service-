package com.company.Employee.Service;

import com.company.Employee.Dao.EmployeeImpDao;
import com.company.Employee.Entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class EmployeeService {

    EmployeeImpDao employeeImpDao;

    public EmployeeService() {
    }

    @Autowired
    public EmployeeService(EmployeeImpDao employeeImpDao) {
        this.employeeImpDao = employeeImpDao;
    }

    public List<Employee> findAll(){

       return employeeImpDao.findAll() ;

    }


    public Employee findbyId(int id) {
        return employeeImpDao.findbyId(id);
    }

    @Transactional
    public Employee save(Employee emp) {
        return employeeImpDao.save(emp);
    }

    @Transactional
    public Employee merge(Employee emp) {
        return employeeImpDao.merge(emp);
    }

    @Transactional
    public void deleteById(@PathVariable int id) {
        employeeImpDao.deleteById(id);
    }



}
