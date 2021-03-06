package com.jobs.domain;

public class Mid extends Employee implements Pays {

	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;

	public Mid(String name, String address, String phone, double salaryPerMonth, IPaymentRate paymentRate)
			throws Exception {
		super(name, address, phone, salaryPerMonth, paymentRate);

		try {

			if (salaryPerMonth > 1800 && salaryPerMonth < 2500) {

			} else {

				setSalaryPerMonth(1800);
				throw new SouException("Error! " + super.name + " ,t� un sou de " + salaryPerMonth
						+ " ,el sou base d'Employee Senior �s entre 1800 i 2500 � \n li possem el m�nim, 1800�");

			}

		} catch (SouException e) {
			System.out.println(e.getMessage());
		}

	}

	public void setSalaryPerMonth(double salaryPerMonth) {
		super.salaryPerMonth = salaryPerMonth;
	}
	public double souNetMensual() {

		return totalPaid*retencioMid;
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