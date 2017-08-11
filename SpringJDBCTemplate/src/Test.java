import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDAO dao=(EmployeeDAO)context.getBean("empDAO"); 
		dao.insertEmployee(new Employee(1,"hemant",25000));
	}
}