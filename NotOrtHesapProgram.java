import java.util.Scanner;
public class NotOrtHesapProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner k = new Scanner (System.in);

System.out.println("notlarinizi giriniz");

int mat = k.nextInt();
int fizik = k.nextInt();
int kimya = k.nextInt();
int turkce =k.nextInt();
int tarih = k.nextInt();
int muzik = k.nextInt();

int toplam = (mat+fizik+kimya+turkce+tarih+ muzik);
		double ort = toplam /6;
		System.out.println(ort);
		
		boolean kosul =   ort>=60;
		String sonuc = kosul ? "geçti": "kaldı";
		System.out.println(sonuc);
	
		


	}

}
