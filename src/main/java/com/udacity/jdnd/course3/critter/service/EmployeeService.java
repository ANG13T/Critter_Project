package com.udacity.jdnd.course3.critter.service;

import com.udacity.jdnd.course3.critter.entity.Employee;
import com.udacity.jdnd.course3.critter.entity.Hamster;
import com.udacity.jdnd.course3.critter.repository.EmployeeRepository;
import com.udacity.jdnd.course3.critter.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public Long save(Employee employee){
        employeeRepository.persist(employee);
        return employee.getId();
    }

    public Long update(Employee employee){
        employeeRepository.merge(employee);
        return employee.getId();
    }

    public void delete(Long id){
        employeeRepository.delete(id);
    }

    public Employee get(Long id){
        return employeeRepository.find(id);
    }
}
