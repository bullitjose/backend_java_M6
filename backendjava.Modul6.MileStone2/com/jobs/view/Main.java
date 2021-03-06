package com.jobs.view;

import com.jobs.application.JobsController;

public class Main {

	private static JobsController controller = new JobsController();

	public static void main(String[] args) throws Exception {

		controller.createBossEmployee("Pepe Boss", "Direcci� molona", "666666666", 100.0);
		controller.createMidEmployee("Pedro Employee Mid", "Direcci� molona 2", "665266666", 40.0);
		controller.createSeniorEmployee("Laura Employee Senior", "Direcci� molona 3", "625266666", 45.0);
		controller.createVolunteer("Juan Volunteer", "Direcci� molona 4", "614266666", "descripcion");
		controller.createManagerEmployee("Pedro Employee Manager", "Direcci� molona 2", "665226666", 80.0);
		controller.createJuniorEmployee("Pepe Employee Junior", "Direcci� molona 1", "665226666", 80.0);
		controller.createMidEmployee("Paula Employee Mid", "Direcci� molona 7", "665226666", 80.0);
		controller.payAllEmployeers();

		String allEmployees = controller.getAllEmployees();

		System.out.println("EMPLOYEES: " + " \n" + allEmployees + " \n");

	}

}
