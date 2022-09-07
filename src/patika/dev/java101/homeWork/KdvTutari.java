package patika.dev.java101.homeWork;

import java.util.Scanner;

public class KdvTutari {
	public static void main(String[] args) {
		int kdv = 0, cost;
		Scanner sc = new Scanner(System.in);

		System.out.print("Satis Tutarini giriniz: ");
		int input = sc.nextInt();

		if ((input >= 0) && (input < 1000)) {
			kdv = 18;
		} else if (input > 1000) {
			kdv = 8;
		} else {
			System.out.println("Yanlis Giris");
		}
		cost = input * kdv / 100;
		if (cost > 0) {
			System.out.println("KDV'siz Fiyat = " + input);
			System.out.println("KDV'li Fiyat = " + (input + cost));
			System.out.println("KDV Tutari = " + cost);
		}

		sc.close();
	}
}
