import java.util.Scanner;
public class ManavKasaHesapProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner k = new Scanner(System.in);
		
		System.out.print("Kaç kg armut aldınız");
		double armut = k.nextDouble();	
		double fiyatA = 2.14 * armut;
		
		System.out.print("Kaç kg elma aldınız");
		double elma = k.nextDouble();	
		double fiyatE = 3.67 * elma;
		
		System.out.print("Kaç kg domates aldınız");
		double domates = k.nextDouble();	
		double fiyatD = 1.11 * domates;
		
		System.out.print("Kaç kg muz aldınız");
		double muz = k.nextDouble();	
		double fiyatM = 0.95 * muz;
		
		System.out.print("Kaç kg patlıcan aldınız");
		double patlican = k.nextDouble();	
		double fiyatP = 5.0 * patlican;
		
		
		double toplamUcret = fiyatA+fiyatE+fiyatD+fiyatM+fiyatP;
		System.out.print("Toplam ücret : " + toplamUcret);
		
		
		
		
		
		
/*
 * Java ile kullanıcıların manavdan almış oldukları ürünlerin 
 * kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL

 */
	}

}
