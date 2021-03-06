package com.jobs.domain;

public class Senior extends Employee {

	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;	

	public Senior(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone,salaryPerMonth,paymentRate);		
		try {

			if (salaryPerMonth > 2700 && salaryPerMonth < 4000) {

			} else {

				setSalaryPerMonth(2700);
				throw new SouJuniorException("Error! " + super.name + " ,té un sou de " + salaryPerMonth
						+ " ,el sou base d'Employee Senior és entre 2700 i 4000 € \n li possem el mínim, 2700€");
			
			}

		} catch (SouJuniorException e) {
			System.out.println(e.getMessage());
		}

	}

	public void setSalaryPerMonth(double salaryPerMonth) {
		super.salaryPerMonth = salaryPerMonth;
	}
}