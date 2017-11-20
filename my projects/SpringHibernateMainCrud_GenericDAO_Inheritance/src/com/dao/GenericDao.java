package com.dao;

import java.util.List;

import com.Model.Employee;
import com.Model.Person;

public interface GenericDao<T> {
	public void save(T p);
	public List<T> getList(String className);
	public void update(T p);
	public void delete(int id,String className);
}
