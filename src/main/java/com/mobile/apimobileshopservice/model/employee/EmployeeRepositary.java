package com.mobile.apimobileshopservice.model.employee;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepositary extends CrudRepository<Employee, Integer>{

}
