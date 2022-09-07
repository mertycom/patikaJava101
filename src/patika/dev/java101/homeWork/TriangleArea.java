package patika.dev.java101.homeWork;

import java.util.Scanner;

public class TriangleArea {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int firstEdge = scanEdge(1);
		int secondEdge = scanEdge(2);
		int thirdEgde = scanEdge(3);
		int sum = (firstEdge+secondEdge+thirdEgde)/2;
		int area = (int) Math.sqrt(sum * (sum - firstEdge) * (sum - secondEdge) * (sum - thirdEgde));
		
		System.out.println("Alan: "+area);
	}
	
	private static int scanEdge(int i) {
		System.out.print("Lutfen " + i + ". kenar uzunlugunu giriniz: ");
		int number = sc.nextInt();
		return number;
	}
}
