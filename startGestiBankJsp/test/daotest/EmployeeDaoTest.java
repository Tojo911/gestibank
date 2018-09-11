package daotest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.wha.dao.EmployeeDAO;
import com.wha.model.Employee;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-servlet.xml"})
public class EmployeeDaoTest {
	
	@Autowired
	private EmployeeDAO empDao;
	
	@Test
	@Transactional
	@Rollback(true)
	public void addEmployeeTest() {
		int taille = empDao.getAllEmployees().size();
		
		Employee emp = new Employee();
		emp.setAddress("Lyon 69000");
		emp.setName("hajji");
		emp.setTelephone("06235689");
		
		empDao.addEmployee(emp);
		
		int taille2 = empDao.getAllEmployees().size();
		
		assertEquals(1, taille2 - taille);
		
	}
	
	
	@Test
	@Transactional
	@Rollback(true)
	public void getEmployeeTest() {
		Employee emp = new Employee();
		emp.setAddress("Lyon 69000");
		emp.setName("hajji");
		emp.setTelephone("06235689");
		
		empDao.addEmployee(emp);
		
		Employee result = empDao.getEmployee(1);
		
		
		assertEquals("hajji", result.getName());
		
	}
	
	
	
	
	

}
