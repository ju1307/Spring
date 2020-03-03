package org.demo.model;

import org.demo.common.BaseEntity;
import org.springframework.stereotype.Component;

@Component
public class Address extends BaseEntity {

	private static final long serialVersionUID = 5901195728380105037L;
	private Long pincode;

	public Long getPincode() {
		return pincode;
	}

	public void setPincode(final Long pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address is : " + super.getName();
	}

}
