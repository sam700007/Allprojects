package com.dao;

import java.util.List;

import com.Model.Employee;

public interface EmployeeDao {
	public void save(Employee p);
	public List<Employee> employeeList();
}
