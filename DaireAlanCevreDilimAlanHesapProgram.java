import java.util.Scanner;
public class DaireAlanCevreDilimAlanHesapProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner k = new Scanner(System.in);
		double r = k.nextDouble();  // yaricap
		double a = k.nextDouble(); //merkez aci
		double pi = 3.14;
		double cevre = 2 * pi * r;
		double alan = pi * r * r ;
		double dilimAlan = pi * a * (r*r) /360 ; 
		
		System.out.println("cevre " + cevre);
		System.out.println("alan " + alan);
		System.out.println("dilim alani " + dilimAlan );
		
		/*
		
		Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
		Alan Formülü : π * r * r;  Çevre Formülü : 2 * π * r;
		Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
		𝜋 sayısını = 3.14 alınız. Formül : (𝜋 * (r*r) * 𝛼) / 360
		
		*/
	}

}
