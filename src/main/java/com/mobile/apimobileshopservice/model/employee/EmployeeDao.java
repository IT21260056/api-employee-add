package com.mobile.apimobileshopservice.model.employee;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class EmployeeDao {
    @Autowired
    private EmployeeRepositary repository;

    public Employee save(Employee employee){
        return repository.save(employee);
    }

    public  List<Employee> getAllEmployee(){
        List<Employee> employees = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(employees::add);
        return employees;
    }

    public void delete(Employee employee){
        repository.delete(employee);
    }
}
