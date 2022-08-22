import java.util.Scanner;
public class GirilenUcSayiyiKucuktenBuyugeSiralayanProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner k = new Scanner(System.in);
		System.out.println( "Sayilari giriniz: ");
		System.out.print( "a= ");
		int a = k.nextInt();
		System.out.print( "b= ");
		int b = k.nextInt();
		System.out.print( "c= ");
		int c = k.nextInt();
		
		
		
		
		if (a < b && a < c ) {
			System.out.println(a + " en kucuk sayidir");
			 
			if (b<c) {
				System.out.println(c + " en buyuk sayidir");
				System.out.println( "a<b<c");
			}
			
			else {
				System.out.println(b + " en buyuk sayidir");
				System.out.println("a<c<b");
			}	
		
		}
		
		
		
		
		else if  (b < a && b < c ) {
			System.out.println(b + " en kucuk sayidir");
			
			if (a<c) {
				System.out.println(c + " en buyuk sayidir");
				System.out.println("b<a<c");
			}
			
			else {
				System.out.println(a + " en buyuk sayidir");
				System.out.println("b<c<a");
			}
		}
		
		
		
	
		else if (c < a && c < b ){
			System.out.println(c + " en kucuk sayidir");
			
			if (a<b) {
				System.out.println(b + " en buyuk sayidir");
				System.out.println("c<a<b");
			}
			
			else {
				System.out.println(a + " en buyuk sayidir");
				System.out.println("c<b<a");
			}	
		}
		
		
		
		
		else {
			System.out.println("bu sayilar esittir");
		}
		
		
/*
 * Ödev
Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
 */
		
	}

}
