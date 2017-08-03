

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {	
	public static void main(String[] args) {
		ApplicationContext context =   
			    new ClassPathXmlApplicationContext("applicationContext.xml");  
		//Resource r=new ClassPathResource("applicationContext.xml");
		//BeanFactory factory=new XmlBeanFactory(context);
		Student student=context.getBean("studentBean",Student.class);
		student.displayInfo();
	}
}


