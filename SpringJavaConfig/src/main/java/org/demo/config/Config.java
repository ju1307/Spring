package org.demo.config;

import org.demo.BasicInterface;
import org.demo.BasicInterfaceImpl;
import org.demo.SecondBasicImpl;
import org.demo.model.Company;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.demo.*")
public class Config {

	@Bean
	public Company getCompanyBean() {
		Company company = new Company();
		company.setName("XYZ");
		return company;
	}

	@Bean("one")
	public BasicInterface getBasicInterfaceImpl() {
		return new BasicInterfaceImpl();
	}

	@Bean("two")
	public BasicInterface getSecondBasicImpl() {
		return new SecondBasicImpl();
	}

}
