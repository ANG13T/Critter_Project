package com.udacity.jdnd.course3.critter.service;

import com.udacity.jdnd.course3.critter.entity.Customer;
import com.udacity.jdnd.course3.critter.entity.Employee;
import com.udacity.jdnd.course3.critter.repository.CustomerRepository;
import com.udacity.jdnd.course3.critter.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public Long save(Customer customer){
        customerRepository.persist(customer);
        return customer.getId();
    }

    public Long update(Customer customer){
        customerRepository.merge(customer);
        return customer.getId();
    }

    public void delete(Long id){
        customerRepository.delete(id);
    }

    public Customer get(Long id){
        return customerRepository.find(id);
    }
}
