package patika.dev.java101.homeWork.MaasHesap;

public class Test {
	public static void main(String[] args) {
		Employee kemal = new Employee("Kemal", 2000, 45, 1985);

		double tax = kemal.tax(kemal.getSalary());
		int bonus = kemal.bonus(kemal.getWorkHours());
		int raise = kemal.raiseSalary(kemal.getHireYear());
		System.out.println(kemal.toString());
		System.out.println("Vergi: " + tax);
		System.out.println("Bonus: " + bonus);
		System.out.println("Vergi ve Bonuslar ile birlikte maas : " + (kemal.getSalary() - tax + bonus));
		System.out.println("Maas artisi: " + raise);
		System.out.println("Yeni maas: " + (kemal.getSalary() - tax + bonus + raise));
		
	}
}
