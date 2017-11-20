package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Model.Person;

public class PersonDaoImpl implements PersonDao {
	private SessionFactory mySessionFactory;

	public void setMySessionFactory(SessionFactory mySessionFactory) {
		this.mySessionFactory = mySessionFactory;
	}

	public void save(Person person) {
		System.out.println("-----------PersonDaoImpl Save called----");
		Session session=mySessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.persist(person);
		tx.commit();
		session.close();
	System.out.println("----PersonDaoImpl save done-----");
	}

	public List<Person> employeeList() {
		System.out.println("-----------employeeList Save called----");
		Session session=mySessionFactory.openSession();
		//session.createQuery("from student");
		List<Person> personList=session.createQuery("from Person").list();
		session.close();
	System.out.println("----employeeList save done-----");
		return personList;
	}

	public void update(Person person) {
		System.out.println("-----------PersonDaoImpl update called----");
		Session session=mySessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.update(person);
		tx.commit();
		session.close();
		System.out.println("----PersonDaoImpl update done-----");		
	}

	public void delete(int id) {
		System.out.println("-----------PersonDaoImpl delete called----");
		Session session=mySessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		List<Person> person=session.createQuery("from Person where uniqueId="+id).list();
		if(person!=null){
		session.delete(person.get(0));
		}
		tx.commit();
		session.close();
		System.out.println("-----------PersonDaoImpl delete done-----");
	}

}
