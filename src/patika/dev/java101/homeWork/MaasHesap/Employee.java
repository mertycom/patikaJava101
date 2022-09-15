package patika.dev.java101.homeWork.MaasHesap;

public class Employee {
	private String name;
	private int salary;
	private int workHours;
	private int hireYear;

	public double tax(int salary) {
		double vergi;
		if (salary > 1000) {
			vergi = 0.03;
		} else {
			vergi = 0;
		}
		return salary * vergi;
	}

	public int bonus(int workHours) {
		int bonus = 0;
		if (workHours > 40) {
			bonus = (workHours - 40) * 30;
		}
		return bonus;
	}

	public int raiseSalary(int hireYear) {
		int todaysYear = 2021;
		int newSalary;
		int opTime = todaysYear - hireYear;
		if (opTime<10) {
			newSalary= (int)(this.salary*1.05);
		}else if ((opTime>9) && (opTime<20)) {
			newSalary= (int)(this.salary*1.1);
		}else {
			newSalary=(int)(this.salary*1.15);
		}
		return newSalary-this.salary;
	}

	public Employee(String name, int salary, int workHours, int hireYear) {
		super();
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getWorkHours() {
		return workHours;
	}

	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}

	public int getHireYear() {
		return hireYear;
	}

	public void setHireYear(int hireYear) {
		this.hireYear = hireYear;
	}

	@Override
	public String toString() {
		return "Calisanin [Adi=" + name + ", Maas=" + salary + ", Calisma Saati=" + workHours + ", Baslama Yili=" + hireYear
				+ "]";
	}

}
