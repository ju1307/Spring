package org.demo.model;

import org.demo.common.BaseEntity;

public class Department extends BaseEntity {

	private static final long serialVersionUID = 8397280579022429254L;

	@Override
	public String toString() {
		return "Department name is : " + super.getName();
	}
}
