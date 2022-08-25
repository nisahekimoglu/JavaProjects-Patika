import java.util.Scanner;
public class GirilenSayiyaKadarkiCiftSayilariBulanProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner k = new Scanner(System.in);
       System.out.print("Sayi giriniz: ");
		int sayi = k.nextInt();
		int toplam = 0;
		int sayac = 0;
		int a;
		
		
		for (int i = 0 ; i<=sayi ; i++) {
			
		if (i%4==0 && i%3==0 ) {
			    toplam+=i;
			    sayac++;
			    double  ort= toplam/sayac;
			   
			    System.out.println("4 ve 3 e tam bolunenler: " + i);	
			    System.out.println("ortalama: " + ort);
				
		}
		
		}
		
		System.out.println(sayac);
		System.out.println(toplam);
		
		
		for (a=0; a<sayi;a++) {	
		if (a%2==0 ) {
			System.out.println("2 ye tam bolunenler: " + a);
		  }
		}
		
		
		
		
		
	}

}
