package patika.dev.java101.homeWork;

import java.util.Scanner;

public class CircleSliceArea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Yaricapi: ");
		int r = sc.nextInt();
		System.out.print("Aci: ");
		int angle = sc.nextInt();
		double pi = 3.14d;

		double area = (pi * (r * r) * angle) / 360;
		System.out.println("Alani :" + area);

	}
}
