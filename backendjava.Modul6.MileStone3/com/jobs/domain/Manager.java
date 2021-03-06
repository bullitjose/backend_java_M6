package com.jobs.domain;

public class Manager extends AbsStaffMember {

	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;

	public Manager(String name, String address, String phone, double salaryPerMonth, IPaymentRate paymentRate)
			throws Exception {
		super(name, address, phone);
		if (salaryPerMonth < 0)
			throw new Exception();
		if (paymentRate == null)
			throw new Exception();

		this.salaryPerMonth = salaryPerMonth;
		this.paymentRate = paymentRate;

		try {

			if (salaryPerMonth > 3000 && salaryPerMonth < 5000) {

			} else {

				setSalaryPerMonth(3000);
				throw new SouException("Error! " + super.name + " ,t? un sou de " + salaryPerMonth
						+ " ,el sou base d'Employee Senior esta entre 3000 i 5000 ? \n li possem el minim, 3000?");

			}

		} catch (SouException e) {
			System.out.println(e.getMessage());
		}

	}

	@Override
	public void pay() {
		totalPaid = paymentRate.pay(salaryPerMonth);
	}

	public double getSalaryPerMonth() {
		return salaryPerMonth;
	}

	public void setSalaryPerMonth(double salaryPerMonth) {
		this.salaryPerMonth = salaryPerMonth;
	}

	public IPaymentRate getPaymentRate() {
		return paymentRate;
	}

	public void setPaymentRate(IPaymentRate paymentRate) {
		this.paymentRate = paymentRate;
	}

	public double souNetMensual() {

		return totalPaid*retencioManager;
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
