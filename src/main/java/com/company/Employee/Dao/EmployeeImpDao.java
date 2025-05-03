package com.company.Employee.Dao;

import com.company.Employee.Entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeImpDao implements EmployeeDao{

    EntityManager entityManager;

    public EmployeeImpDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {

        TypedQuery<Employee> query = entityManager.createQuery("FROM Employee", Employee.class);

        return query.getResultList();
    }

    public Employee findbyId(int id) {
        return entityManager.find(Employee.class, id);

    }

    @Override
    @Transactional
    public Employee save(Employee employee) {
        entityManager.persist(employee);
        return employee;
    }


    @Transactional
    public Employee merge(Employee emp) {

        return entityManager.merge(emp);
    }


    @Transactional
    public void deleteById(int id) {
        Employee emp = entityManager.find(Employee.class, id);
        if (emp != null) {
            entityManager.remove(emp);
        }
    }

}
