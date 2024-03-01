package Entities_Curso;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import Entities.Enums.WORKER_LEVEL;

public class WORKER {
	
	private String name;
	private WORKER_LEVEL level;
	private Double baseSalary;
	
	private DEPARTAMENT department;
	private List<HOUR_CONTRACT> contracts = new ArrayList<>();
	
	public WORKER() {
	}
	public WORKER(String name, WORKER_LEVEL level, Double baseSalary, DEPARTAMENT department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public WORKER_LEVEL getLevel() {
		return level;
	}
	public void setLevel(WORKER_LEVEL level) {
		this.level = level;
	}
	public Double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public DEPARTAMENT getDepartment() {
		return department;
	}
	public void setDepartment(DEPARTAMENT department) {
		this.department = department;
	}
	public List<HOUR_CONTRACT> getContracts() {
		return contracts;
	}
	public void addContract(HOUR_CONTRACT contract) {
		contracts.add(contract);
	}
	public void removeContract(HOUR_CONTRACT contract) {
		contracts.remove(contract);
	}
	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for (HOUR_CONTRACT c : contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			if (year == c_year && month == c_month) {
			   sum += c.totalValue();
			}
		}
		return sum;
	}
}
