package com.jobs.domain;

public class Volunteer extends AbsStaffMember {

	protected String description;
	private double ajutGovern = 0.0;

	public Volunteer(String name, String address, String phone, String description) throws Exception {
		super(name, address, phone);

		this.description = description;

	}

	@Override
	public void pay() {
		// TODO
		totalPaid = 0;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setAjutGovern(double ajutGovern) {
		

		try {

			if (ajutGovern < 300) {
				this.ajutGovern = ajutGovern;
			} else {
				this.ajutGovern = 300;
			
				throw new SouException("Error!,els ajuts al volunteer "+super.name+" no poden superar els 300€ \n li possem el màxim, 300€");

			}

		} catch (SouException e) {
			System.out.println(e.getMessage());
		}
	}

	public double getAjutGovern() {
		// TODO
		return ajutGovern;

	}

	@Override
	public double souBrutMensual() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double souNetMensual() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double souBrutAnual() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double souNetAnual() {
		// TODO Auto-generated method stub
		return 0;
	}

}
