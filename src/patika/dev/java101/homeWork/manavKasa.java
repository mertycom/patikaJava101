package patika.dev.java101.homeWork;

import java.util.Scanner;

public class manavKasa {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		double pear, apple, tomatoes, banana, eggplant;
		double pearPrice = 2.14;
		double applePrice = 3.67;
		double tomatoesPrice = 1.11;
		double bananaPrice = 0.95;
		double eggplantPrice = 5.00;
		double totalPrice = 0;

		System.out.print("Armut Kac Kilo?: ");
		pear = scInt();
		totalPrice += pear * pearPrice;
		System.out.print("Elma Kac Kilo?: ");
		apple = scInt();
		totalPrice += apple * applePrice;
		System.out.print("Domates Kac Kilo?: ");
		tomatoes = scInt();
		totalPrice += tomatoes * tomatoesPrice;
		System.out.print("Muz Kac Kilo?: ");
		banana = scInt();
		totalPrice += banana * bananaPrice;
		System.out.print("Patlican Kac Kilo?: ");
		eggplant = scInt();
		totalPrice += eggplant * eggplantPrice;

		System.out.print("Toplam Tutar: ");
		System.out.format("%.2f", totalPrice);
		System.out.print("TL");
	}

	private static int scInt() {
		int number = sc.nextInt();
		return number;
	}
}
