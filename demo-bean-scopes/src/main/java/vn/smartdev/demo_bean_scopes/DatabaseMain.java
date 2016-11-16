package vn.smartdev.demo_bean_scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DatabaseMain {

	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Database  database = (Database) context.getBean("database");
		try {
			database.afterPropertiesSet();
		} catch (Exception e) {
			
		}
	}
}
