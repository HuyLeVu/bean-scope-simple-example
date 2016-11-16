package vn.smartdev.demo_bean_scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloSpring helloSpring = (HelloSpring) context.getBean("helloSpring");
		
		helloSpring.setMessage("I am Spring Core");
		helloSpring.getMessage();
		
		HelloSpring helloSpring1 = (HelloSpring) context.getBean("helloSpring");
		helloSpring1.getMessage();
	}
}
