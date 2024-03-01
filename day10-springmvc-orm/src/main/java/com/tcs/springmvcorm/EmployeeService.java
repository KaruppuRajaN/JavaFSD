package com.tcs.springmvcorm;

import java.util.List;

public interface EmployeeService {
	List<EmployeeT> getAllEmployees();
	void saveEmployee(EmployeeT employee);
	

}
