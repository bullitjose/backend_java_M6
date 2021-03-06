package com.jobs.domain;

public abstract class AbsStaffMember {

	//REtencions
	final double retencioEmployee=(1);
	final double retencioMid=(1-0.15);
	final double retencioJunior=(1-0.02);
	final double retencioSenior=(1-0.24);
	final double retencioBoss=(1-0.32);
	final double retencioManager=(1-0.26);
	
	
	protected int id;
	

	protected String name;
	protected String address;
	protected String phone;
	protected double totalPaid=0;
	

	private static int COUNTER_MEMBERS = 1;
	// Declaramos variable que la diferencia de volunteer
	private double bonus=0.1;

	public AbsStaffMember(String name, String address, String phone) throws Exception {
		if (name.equals(""))
			throw new Exception();
		if (address.equals(""))
			throw new Exception();
		if (phone.equals(""))
			throw new Exception();

		this.name = name;
		this.address = address;
		this.phone = phone;
		id = COUNTER_MEMBERS;
		COUNTER_MEMBERS++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public double getTotalPaid() {
		return totalPaid;
	}

	public void setTotalPaid(double totalPaid) {
		this.totalPaid = totalPaid;
	}

	public static int getCOUNTER_MEMBERS() {
		return COUNTER_MEMBERS;
	}

	public static void setCOUNTER_MEMBERS(int cOUNTER_MEMBERS) {
		COUNTER_MEMBERS = cOUNTER_MEMBERS;
	}
	
	public double emetreBonus() {
		
		
		return (totalPaid*12)*bonus;
	}

	
	public abstract void pay();

	public abstract double souBrutMensual();

	public abstract double souNetMensual();

	public abstract double souBrutAnual();
	

	public abstract double souNetAnual();
}
