package patika.dev.java101.homeWork;

import java.util.Scanner;

public class NotOrtalamasi {
	public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;
        double notortalamasi;
        String sonuc;

        Scanner sc = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = sc.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = sc.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = sc.nextInt();

        System.out.print("Turkce notunuzu giriniz: ");
        turkce = sc.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        tarih = sc.nextInt();

        System.out.print("Muzik notunuzu giriniz: ");
        muzik = sc.nextInt();

        notortalamasi = (mat + fizik + kimya + turkce + tarih + muzik)/6;
        sonuc = (notortalamasi > 60) ? "Sınıfı geçti" : "Sınıfta Kaldı";
        System.out.println("Ortalamanız: "+notortalamasi+"\nGeçme Durumu: "+sonuc);
        
        sc.close();
    }
}
