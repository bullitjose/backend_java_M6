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
				throw new SouException("Error! " + super.name + " ,t� un sou de " + salaryPerMonth
						+ " ,el sou base d'Employee Junior �s entre 900 i 1600 � \n li possem el m�nim, 900�");

			}

		} catch (SouException e) {
			System.out.println(e.getMessage());
		}

	}

	public void setSalaryPerMonth(double salaryPerMonth) {
		super.salaryPerMonth = salaryPerMonth;
	}

	
	public double souNetMensual() {

		return totalPaid*retencioJunior;
	}

	public double souNetAnual() {
		return souNetMensual() * 12;
	}

	public double souBrutMensual() {
		return totalPaid;
	}

	public double souBrutAnual() {
		return souBrutMensual() * 12;

	}
}