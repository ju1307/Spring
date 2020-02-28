package org.demo;

import org.demo.model.Company;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(final String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
		Company company = (Company) context.getBean("company");

		System.out.println(company.toString() + "  " + company.getAddress().toString());

		System.out.println(company.getDepartments().stream().iterator().next().toString());

	}
}
