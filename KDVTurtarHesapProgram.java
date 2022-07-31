import java.util.Scanner;
public class KDVTurtarHesapProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner k = new Scanner(System.in);
System.out.println("tutar giriniz");
double tutar = k.nextDouble();
double kdv =0.18;
double kdvoran = tutar* kdv;
double kdvlitutar = kdvoran+ tutar;
System.out.println("kdvli tutar " + kdvlitutar);


	}

}
