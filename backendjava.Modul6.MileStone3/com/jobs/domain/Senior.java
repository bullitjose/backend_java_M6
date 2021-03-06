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
				throw new SouException("Error! " + super.name + " ,t� un sou de " + salaryPerMonth
						+ " ,el sou base d'Employee Senior �s entre 2700 i 4000 � \n li possem el m�nim, 2700�");
			
			}

		} catch (SouException e) {
			System.out.println(e.getMessage());
		}

	}

	public void setSalaryPerMonth(double salaryPerMonth) {
		super.salaryPerMonth = salaryPerMonth;
	}
	
	public double souNetMensual() {

		return totalPaid*retencioSenior;
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