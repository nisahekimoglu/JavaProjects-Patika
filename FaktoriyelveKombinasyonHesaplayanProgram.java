import java.util.Scanner;
public class FaktoriyelveKombinasyonHesaplayanProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int fak1=1;
     int fak2=1;
     int fak3=1;
     
		Scanner k = new Scanner(System.in);
		System.out.println("Sayi giriniz: ");
		int n = k.nextInt();
		int r = k.nextInt();
		
		
		for (int i=1 ; i<=n ; i++) {
			//fak *=i;
			fak1 = fak1* i ;
			
			//System.out.println("faktoriyel: " + fak1);	
		}
		
		for ( int i=1 ; i<=r ; i++) {
			fak2*=i;
			//System.out.println("faktoriyel: " + fak2);	
		}
		
		
		int w = n-r;
		
		for ( int i=1 ; i<=w ; i++) {
			fak3*=i;
			//System.out.println("faktoriyel: " + fak3);	
		}
		
		int sonuc = fak1/(fak2*fak3);
		System.out.println(sonuc);
		
	
		
		
		

		/*
		
		Kombinasyon formülü
		C(n,r) = n! / (r! * (n-r)!)
		
		*/
		
	
	}

}
