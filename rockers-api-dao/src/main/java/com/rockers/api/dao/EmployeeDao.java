package com.rockers.api.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.rockers.api.model.Employee;

@Component
public class EmployeeDao implements Crud<Employee> {

	@Override
	public Employee findOne(String id) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee();
		emp1.setNome("employee 1");
		emp1.setEmail("employee1@wipro.com");
		emp1.setWiproId("em321654");	
		emp1.setClientId("321");
		
		return null;
	}

	@Override
	public String save(Employee t) {
		// TODO Auto-generated method stub
		
		t.setClientId("Client ID");
		t.setWiproId("wipro ID");
		return t.getWiproId();
	}

	@Override
	public List<Employee> listAll() {
		// TODO Auto-generated method stub
		
			Employee emp1 = new Employee();
					emp1.setNome("employee 1");
					emp1.setEmail("employee1@wipro.com");
					emp1.setWiproId("em321654");	
					emp1.setClientId("321");
					
					Employee emp2 = new Employee();
					emp2.setNome("employee 2");
					emp2.setEmail("employee2@wipro.com");
					emp2.setWiproId("em123456");	
					emp2.setClientId("123");
					
					List<Employee> listEmployee = new ArrayList<Employee>();
					
					listEmployee.add(emp1);
					listEmployee.add(emp2);
					
					return listEmployee; 
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

}
