package org.demo.api;

import javax.annotation.Resource;

import org.demo.BasicInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TestService {

	@Resource(name = "one")
	BasicInterface service1;

	@Autowired
	@Qualifier("two")
	BasicInterface service2;

	public void showFirstMessage() {
		service1.welcomeMessage();
	}

	public void showSecondMessage() {
		service2.welcomeMessage();
	}

}
