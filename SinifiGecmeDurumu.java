import java.util.Scanner;
public class SinifiGecmeDurumu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner k = new Scanner(System.in);

System.out.println("Notlarinizi giriniz");

int mat = k.nextInt();
int fizik = k.nextInt();
int turkce = k.nextInt();
int kimya = k.nextInt();
int muzik = k.nextInt();
int top = 0;

if (mat>0 && mat<=100 ) {
	top+=mat;

  if (0<=fizik && fizik<=100 ) 
	top+=mat;

  if (turkce>0 && turkce<=100 ) 
	top+=turkce;

  if (kimya>0 && kimya<=100 ) 
	top+=kimya;

  if (muzik>0 && muzik<=100 ) 
	top+=muzik;

    double ort = top / 5;
    
    if (ort >= 55) {
	  System.out.println("Ortalamaniz : " + ort );
	  System.out.println("Sinifi gectiniz");
    }
    else {
	  System.out.println("Ortalamaniz : " + ort );
	  System.out.println("Kaldiniz");
    }
}

else {
System.out.println("Notlariniz 0 ile 100 arasinda degil");
}

}   
}

