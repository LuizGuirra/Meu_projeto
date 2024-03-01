package Applicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entities_Curso.DEPARTAMENT;
import Entities_Curso.HOUR_CONTRACT;
import Entities_Curso.WORKER;
import Entities.Enums.WORKER_LEVEL;

public class PROGRAMA_JAVA {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		
		System.out.println("Enter worker data:");
		
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		
		WORKER worker = new WORKER(workerName, WORKER_LEVEL.valueOf(workerLevel), baseSalary, new DEPARTAMENT(departmentName));
		
		System.out.println("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter contract #" + i + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			HOUR_CONTRACT contract = new HOUR_CONTRACT(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		
		System.out.println();
		
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		sc.close();
	}

}
