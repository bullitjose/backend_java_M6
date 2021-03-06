package com.jobs.domain;

public class Junior extends Employee {

	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;

	public Junior(String name, String address, String phone, double salaryPerMonth, IPaymentRate paymentRate)
			throws Exception {

		super(name, address, phone, salaryPerMonth, paymentRate);
		try {

			if (salaryPerMonth > 900 && salaryPerMonth < 1600) {

			} else {

				setSalaryPerMonth(900);
				throw new SouJuniorException("Error! " + super.name + " ,té un sou de " + salaryPerMonth
						+ " ,el sou base d'Employee Junior és entre 900 i 1600 € \n li possem el mínim, 900€");

			}

		} catch (SouJuniorException e) {
			System.out.println(e.getMessage());
		}

	}

	public void setSalaryPerMonth(double salaryPerMonth) {
		super.salaryPerMonth = salaryPerMonth;
	}
}