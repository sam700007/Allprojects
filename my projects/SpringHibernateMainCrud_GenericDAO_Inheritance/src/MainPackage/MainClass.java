package MainPackage;

import java.awt.List;
import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Model.Address;
import com.Model.Employee;
import com.Model.Person;
import com.dao.GenericDao;
import com.dao.GenericDaoImpl;

import org.hibernate.cfg.AnnotationConfiguration;

public class MainClass {
	private static SessionFactory factory; 
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//----
		Employee employee=(Employee)context.getBean("employee");
		Address address=(Address)context.getBean("address");
		address.setFlatNo(101);
		address.setCity("Pune");
		address.setState("MH");
		address.setStreet("Kalsh Road");
		//person.setUniqueId(40);
		employee.setAge(500);
		employee.setName("Arun2");	
		employee.setCompanyName("Saba");
		employee.setDepartment("Content");
		employee.setAddress(address);
		//-----		
		GenericDao<Employee> genericDao=context.getBean(GenericDaoImpl.class);
		genericDao.save(employee);
		
		
		ArrayList<Employee> personList=(ArrayList<Employee>) genericDao.getList("Employee");
		
		for(int i=0;i<personList.size();i++)
		{
			System.out.println("========>"+personList.get(i).getUniqueId()+" : "+personList.get(i).getCompanyName());
		}
		
	}

}
