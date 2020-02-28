package org.demo.model;

import java.util.List;

import org.demo.common.BaseEntity;

public class Company extends BaseEntity {

	private static final long serialVersionUID = -602341495941175074L;

	private Address address;
	private List<Department> departments;

	public Address getAddress() {
		return address;
	}

	public void setAddress(final Address address) {
		this.address = address;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(final List<Department> departments) {
		this.departments = departments;
	}

	@Override
	public String toString() {
		return "Company name is : " + super.getName();
	}

}
