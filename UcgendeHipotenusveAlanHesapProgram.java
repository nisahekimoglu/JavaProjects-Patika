import java.util.Scanner;
public class UcgendeHipotenusveAlanHesapProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner h = new Scanner(System.in);
	
	System.out.println("kenarlari giriniz");
	
	double k1 = h.nextDouble();
	double k2 = h.nextDouble();
	
	
	double hipo = (k1 * k1) + (k2*k2);
	 double hipotenus = Math.sqrt(hipo);

	System.out.println("hipotenus " + hipotenus);
	
	double cevre = 2*(k1+k2+hipotenus);
	
	double u = (k1+k2+hipotenus);
	
	double alan = u* (u-k1) * (u-k2)* (u-hipotenus);
	
	double gercekAlan = Math.sqrt(alan);
	System.out.println(gercekAlan);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüs ile alani hesaplayan programı yazın.

	}

}
