package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Model.Employee;
import com.Model.Person;

public class GenericDaoImpl<T> implements GenericDao<T> {

	private SessionFactory mySessionFactory;

	public void setMySessionFactory(SessionFactory mySessionFactory) {
		this.mySessionFactory = mySessionFactory;
	}
	
	public void save(T p) {
		System.out.println("-----------GenericDaoImpl Save called----:"+p.getClass().getName());
		Session session=mySessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.persist(p);
		tx.commit();
		session.close();
		System.out.println("----GenericDaoImpl save done-----");
	}

	public List<T> getList(String className) {
		System.out.println("----------- GenericDaoImpl List Save called----");
		Session session=mySessionFactory.openSession();
		List<T> personList=session.createQuery("from "+className).list();
		session.close();
	System.out.println("----GenericDaoImpl List save done-----");
		return personList;
	}

	public void update(T p) {
		System.out.println("-----------GenericDaoImpl update called----");
		Session session=mySessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.update(p);
		tx.commit();
		session.close();
		System.out.println("----GenericDaoImpl update done-----");	
	}

	public void delete(int id,String className) {
		System.out.println("-----------GenericDaoImpl delete called----");
		Session session=mySessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		String queryStr="from "+className+" where uniqueId="+id;
		List<T> person=session.createQuery(queryStr).list();
		if(person!=null){
		session.delete(person.get(0));
		}
		tx.commit();
		session.close();
		System.out.println("-----------GenericDaoImpl delete done-----");
	}

}
