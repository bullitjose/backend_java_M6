package com.jobs.application;

import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Boss;
import com.jobs.domain.Employee;
import com.jobs.domain.Junior;
import com.jobs.domain.Manager;
import com.jobs.domain.Mid;
import com.jobs.domain.Senior;
import com.jobs.domain.Volunteer;
import com.jobs.persistence.EmployeeRepository;

public class JobsController {

	private EmployeeRepository repository;

	public JobsController() {
		repository = new EmployeeRepository();
	}

	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception {
		
		Boss boss = new Boss(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateBoss());

		repository.addMember(boss);

	}

	public void createJuniorEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception {
		Junior junior = new Junior(name, address, phone, salaryPerMonth,
				PaymentFactory.createPaymentRateEmployee());

		repository.addMember(junior);
	}
	public void createMidEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception {
		Mid mid = new Mid(name, address, phone, salaryPerMonth,
				PaymentFactory.createPaymentRateEmployee());

		repository.addMember(mid);
	}
	public void createSeniorEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception {
		Senior senior = new Senior(name, address, phone, salaryPerMonth,
				PaymentFactory.createPaymentRateEmployee());

		repository.addMember(senior);
	}

	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth)
			throws Exception {
		// TODO Auto-generated method stub

		Manager manager = new Manager(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateManager());
		repository.addMember(manager);

	}

	public void payAllEmployeers() {
		// TODO Auto-generated method stub
		for (AbsStaffMember e : repository.getAllMembers()) {
			e.pay();
		}
	}

	public String getAllEmployees() {
		// TODO Auto-generated method stub

		StringBuilder repositoryToString = new StringBuilder();

		for (AbsStaffMember e : repository.getAllMembers()) {

			repositoryToString.append("Nom: " + e.getName() +" ,Direcció: "+e.getAddress()+" ,Telefon: "+e.getPhone()+" ,Sou= " + e.getTotalPaid() + "\n");
		}

		String singleString = repositoryToString.toString();
		return singleString;
	}

	public void createVolunteer(String name, String address, String phone, String description) throws Exception {
		// TODO Auto-generated method stub
		Volunteer volunteer = new Volunteer(name, address, phone, description);
		repository.addMember(volunteer);
	}

}
