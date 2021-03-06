package com.jobs.domain;

public class Mid extends Employee {

	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;	

	public Mid(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone,salaryPerMonth,paymentRate);		
		
		try {

			if (salaryPerMonth > 1800 && salaryPerMonth < 2500) {

			} else {

				setSalaryPerMonth(1800);
				throw new SouJuniorException("Error! " + super.name + " ,té un sou de " + salaryPerMonth
						+ " ,el sou base d'Employee Senior és entre 1800 i 2500 € \n li possem el mínim, 1800€");
			
			}

		} catch (SouJuniorException e) {
			System.out.println(e.getMessage());
		}

	}

	public void setSalaryPerMonth(double salaryPerMonth) {
		super.salaryPerMonth = salaryPerMonth;
	}
}