import java.util.Scanner;
public class TaksimetreProgrami {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner k = new Scanner(System.in);
	
	double mesafe = k.nextDouble();
	
	double tutar = 10 + (mesafe * 2.20);
	
   double sonuc = tutar > 20 ? tutar : 20 ;
   
	System.out.println(sonuc);

		
	
		
		/*
		
		Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

		Taksimetre KM başına 2.20 TL tutmaktadır.
		Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
		Taksimetre açılış ücreti 10 TL'dir.	
		*/
		
		
	}

}
