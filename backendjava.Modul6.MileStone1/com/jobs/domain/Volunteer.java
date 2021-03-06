package com.jobs.domain;

public class Volunteer extends AbsStaffMember {

	protected String description;
	
	public Volunteer(String name, String address, String phone, String description) throws Exception {
		super(name, address, phone);
		
		//TODO
		this.description=description;
	}

	
	@Override
	public void pay() {
		//TODO
		totalPaid=0;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}

}
