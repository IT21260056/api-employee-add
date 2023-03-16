package com.mobile.apimobileshopservice;

import com.mobile.apimobileshopservice.model.employee.Employee;
import com.mobile.apimobileshopservice.model.employee.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class ApiMobileShopServiceApplicationTests {


	@Autowired
	private EmployeeDao employeeDao;
//	@Test
	void addEmployeeTest() {
		Employee employee = new Employee();
		employee.setName("Ranaweera");
		employee.setLocation("Pannala");
		employee.setBranch("pannala");
		employeeDao.save(employee);
	}

//	@Test
	void getAllEmployees(){
		List<Employee> employees = employeeDao.getAllEmployee();
		System.out.println(employees);
	}

//	@Test
	void getAllEmployeesAndDeleteThem(){
		List<Employee> employees = employeeDao.getAllEmployee();
		for (Employee employee : employees){
			employeeDao.delete(employee);
		}
	}

//	public void delete(int employeeId){
//		repository.deleteById(employeeId);
//	}

}
