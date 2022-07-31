import java.util.Scanner;
public class KDVTurtarHesapProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner k = new Scanner(System.in);
System.out.println("tutar giriniz");
double ilktutar = k.nextDouble();

double katsayi = ilktutar<1000 ? 0.18 : 0.8 ;
double kdvtutar = katsayi*ilktutar;
double sontutar = kdvtutar + ilktutar;

System.out.println("kdvli tutar " + sontutar);


	}

}
