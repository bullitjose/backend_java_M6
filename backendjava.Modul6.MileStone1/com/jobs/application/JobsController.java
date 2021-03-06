package com.jobs.application;

import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Boss;
import com.jobs.domain.Employee;
import com.jobs.domain.Manager;
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

	public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception {
		Employee employee = new Employee(name, address, phone, salaryPerMonth,
				PaymentFactory.createPaymentRateEmployee());

		repository.addMember(employee);
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
