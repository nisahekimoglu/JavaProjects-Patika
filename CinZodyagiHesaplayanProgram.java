import java.util.Scanner;
public class CinZodyagiHesaplayanProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner k = new Scanner(System.in);
		System.out.print("Dogum yilinizi giriniz : ");
		int yil = k.nextInt();
		int Zodyag = yil % 12;
		
		switch(Zodyag) {
		
		case 0 :
			Zodyag=0;
			System.out.println("Cin zodyagi burcunuz : maymun");
		break;
		
		case 1 :
			Zodyag=1;
			System.out.println("Cin zodyagi burcunuz : horoz");
		break;
		
		case 2 :
			Zodyag=2;
			System.out.println("Cin zodyagi burcunuz : kopek");
		break;
		
		case 3 :
			Zodyag=3;
			System.out.println("Cin zodyagi burcunuz : domuz");
		break;
		
		case 4 :
			Zodyag=4;
			System.out.println("Cin zodyagi burcunuz : fare");
		break;
		
		case 5 :
			Zodyag=5;
			System.out.println("Cin zodyagi burcunuz : okuz");
		break;
		
		case 6 :
			Zodyag=6;
			System.out.println("Cin zodyagi burcunuz : kaplan");
		break;
		
		case 7 :
			Zodyag=7;
			System.out.println("Cin zodyagi burcunuz : tavsan");
		break;
		
		case 8 :
			Zodyag=8;
			System.out.println("Cin zodyagi burcunuz : ejderha");
		break;
		
		case 9 :
			Zodyag=9;
			System.out.println("Cin zodyagi burcunuz : yilan");
		break;
		
		case 10 :
			
			System.out.println("Cin zodyagi burcunuz : at");
		break;
		
		default:
			Zodyag=11;
			System.out.println("Cin zodyagi burcunuz : koyun");
		break;
		
		
		}
		
		
		
	}

}
