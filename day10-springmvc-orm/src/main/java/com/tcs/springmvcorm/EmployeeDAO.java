package com.tcs.springmvcorm;

import java.util.List;

public interface EmployeeDAO {
    List<EmployeeT> getAllEmployees();
    void saveEmployee(EmployeeT employee);
}