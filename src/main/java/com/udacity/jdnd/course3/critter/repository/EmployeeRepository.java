package com.udacity.jdnd.course3.critter.repository;

import com.udacity.jdnd.course3.critter.entity.Employee;
import com.udacity.jdnd.course3.critter.entity.Schedule;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class EmployeeRepository {
    @PersistenceContext
    EntityManager entityManager;

    public void persist(Employee employee) {
        entityManager.persist(employee);
    }

    public Employee find(Long id) {
        return entityManager.find(Employee.class, id);
    }

    public Employee merge(Employee employee){
        return entityManager.merge(employee);
    }

    public void delete(Long id) {
        Employee employee = entityManager.find(Employee.class, id);
        entityManager.remove(employee);
    }
}
