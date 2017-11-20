package com.dao;

import java.util.List;

import com.Model.Person;

public interface PersonDao {
	public void save(Person p);
	public List<Person> employeeList();
	public void update(Person p);
	public void delete(int i);
}
