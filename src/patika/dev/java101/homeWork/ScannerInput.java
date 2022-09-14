package patika.dev.java101.homeWork;

import java.util.Scanner;

public class ScannerInput {
	public static void main(String[] args) {
		String password = "1234";
		Scanner sc = new Scanner(System.in);
		System.out.print("Sifrenizi giriniz: ");
		String inputSc = sc.nextLine();

		if (!password.equalsIgnoreCase(inputSc)) {
			System.out.println("!!Yanlis Sifre");
			System.out.print("Yeni sifre girmek istermisiniz? (Y/N): ");
			String answer = sc.nextLine();
			
			if (answer.equalsIgnoreCase("Y")) {
				int i = 3;
				while (i > 0) {
					i--;
					
					System.out.println("Yeni sifreyi giriniz: ");
					String newPassword = sc.nextLine();
					if (newPassword.equalsIgnoreCase(password)) {
						if (i==0) {
							System.out.println("Sifre giris hakki kalmadi");
						}
						System.out.println("Sifre olusturulamadi, lutfen baska sifre giriniz. Kalan hak "+i);
					} else {
						System.out.println("Sifre olusturuldu.");
						break;
					}
				}
			}
		}
		System.out.println("Bye..");

		sc.close();
	}
}
