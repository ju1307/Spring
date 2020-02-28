package org.demo.model;

import org.demo.common.BaseEntity;

public class Department extends BaseEntity {

	private static final long serialVersionUID = 8397280579022429254L;

	private Department() {
		/*
		 * for setter injection first no parameterized or no-arg constructor will be
		 * called
		 */
		// though constructor is private it will be called by spring
		System.out.println("dept constructot is called");
	}

	public Department(final Long id, final String name) {
		super(id, name);
	}

	@Override
	public String toString() {
		return "Department name is : " + super.getName();
	}
}
