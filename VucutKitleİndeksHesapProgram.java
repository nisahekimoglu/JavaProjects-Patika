import java.util.Scanner;
public class VucutKitleİndeksHesapProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner k = new Scanner (System.in);
	System.out.print("Boyunuzu metre cinsinden giriniz : ");	
	double boy = k.nextDouble();
	
	System.out.print("Kilonuzu kg cinsinden giriniz : " );
	double kilo = k.nextDouble();
	
	double indeks = kilo / Math.pow(boy , 2);
	System.out.println("Indeksiniz : "+ indeks);
		
	
	
	if(indeks >18.5 && indeks <24.9){ 
		System.out.println("Sonucunuz : ideal" );
	}
	
	else if (indeks <18.5){ 
		System.out.println("Sonucunuz : zayıf" );
	}
	
	else if (indeks >25 && indeks <29.9){ 
		System.out.println("Sonucunuz : şişman" );
	}
	
	else if (indeks >30 && indeks <34.9){ 
		System.out.println("Sonucunuz : obez" );
	}
	
	else { 
		System.out.println("Sonucunuz : aşırı obez" );
	}
	

	
	
		/*
		 * Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
		 *  Aşağıdaki formüle göre kullanıcının
		 *  "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
		 *  Formül = Kilo (kg) / Boy(m) * Boy(m)
		 */
		
		
		
		
		
		
	}

}
