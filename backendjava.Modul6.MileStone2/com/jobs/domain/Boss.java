package com.jobs.domain;

public class Boss extends AbsStaffMember {

	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;	

	public Boss(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone);		
		if(salaryPerMonth<0) throw new Exception();
		if(paymentRate==null) throw new Exception();
				
		this.salaryPerMonth=salaryPerMonth;
		this.paymentRate=paymentRate;
		
		try {

			if (salaryPerMonth > 8000) {

			} else {

				setSalaryPerMonth(8000);
				throw new SouJuniorException("Error! " + super.name + " ,té un sou de " + salaryPerMonth
						+ " ,el sou base d'Employee Boss és més de 8000 € \n li possem el mínim, 8000€");
			
			}

		} catch (SouJuniorException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		
	}
	
	 
	
	@Override
	public void pay() {
		totalPaid=paymentRate.pay(salaryPerMonth);
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
	

}
