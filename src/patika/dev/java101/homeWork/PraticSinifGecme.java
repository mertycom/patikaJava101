package patika.dev.java101.homeWork;

import java.util.Scanner;

public class PraticSinifGecme {
	public static void main(String[] args) {
		int mat,fizik,turkce,kimya,muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu yaziniz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunuzu yaziniz: ");
        fizik = input.nextInt();

        System.out.print("Turkce notunuzu yaziniz: ");
        turkce = input.nextInt();

        System.out.print("Kimya notunuzu yaziniz: ");
        kimya = input.nextInt();

        System.out.print("Muzik notunuzu yaziniz: ");
        muzik = input.nextInt();
        
        double ort;
        ort = (mat + fizik + turkce + kimya + muzik)/5;
        
        if(mat < 0 || mat > 100)
            ort = (fizik + turkce + kimya + muzik)/4;
        if(fizik < 0 || fizik > 100)
        	ort = (mat + turkce + kimya + muzik)/4;
        if(turkce < 0 || turkce > 100)
        	ort = (mat + fizik + kimya + muzik)/4;
        if(kimya < 0 || kimya > 100)
        	ort = (mat + fizik + turkce + muzik)/4;
        if(muzik < 0 || muzik > 100)
        	ort = (mat + fizik + turkce + kimya )/4;
        
        
        if( ort < 55 ) {
            System.out.println("Sinifta kaldiniz. Seneye gorusmek uzere");
        }
        else {
            System.out.println("Sinifi geçtiniz. Tebrikler");
        }
        System.out.println("Ortalamaniz: "+ ort);
        input.close();
	}
}
