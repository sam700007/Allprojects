package MainPackage;

import java.awt.List;
import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Model.Employee;
import com.Model.Person;
import com.dao.PersonDao;
import com.dao.PersonDaoImpl;

import org.hibernate.cfg.AnnotationConfiguration;

public class MainClass {
	private static SessionFactory factory; 
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		
		Person person=(Person)context.getBean("person");
		//person.setUniqueId(40);
		person.setAge(37);
		person.setName("ShRaam");		
		PersonDao personDao=context.getBean(PersonDaoImpl.class);
		personDao.save(person);
		
		person.setUniqueId(40);
		person.setAge(9000);
		person.setName("ShRaam9000");
		personDao.update(person);
		//personDao.delete(10);
		ArrayList<Person> personList=(ArrayList<Person>) personDao.employeeList();
		
		for(int i=0;i<personList.size();i++)
		{
			System.out.println("========>"+personList.get(i).getUniqueId()+" : "+personList.get(i).getName());
		}
		
	}

}
