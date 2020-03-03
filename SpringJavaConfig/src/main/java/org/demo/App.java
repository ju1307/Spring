package org.demo;

import org.demo.api.TestService;
import org.demo.config.Config;
import org.demo.model.Address;
import org.demo.model.Company;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(final String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Company company = context.getBean(Company.class);
		System.out.println(company.toString());

		// by using component annotation
		Address bean = context.getBean(Address.class);
		bean.setName("Pune");
		System.out.println(bean.toString());

		TestService testService = context.getBean(TestService.class);
		testService.showFirstMessage();
		testService.showSecondMessage();

	}
}
