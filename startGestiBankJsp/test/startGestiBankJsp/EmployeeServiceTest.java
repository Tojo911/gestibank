package startGestiBankJsp;

import static org.junit.Assert.assertEquals;

import java.util.List;

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
public class EmployeeServiceTest {
	
	@Autowired
	private EmployeeDAO empDao;
	
	
	@Test
	@Transactional
	@Rollback(true)
	public void addEmployeeTest() {
		Employee emp = new Employee();
		emp.setName("hajji");
		emp.setTelephone("0623568945");
		emp.setEmail("toto@tata.fr");
		empDao.addEmployee(emp);
		
		List<Employee> emps = empDao.getAllEmployees();
		assertEquals("hajji", emps.get(0).getName());
	}

}
