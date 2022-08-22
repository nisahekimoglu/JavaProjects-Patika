import java.util.Scanner;
public class BurcHesaplayanProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	Scanner k = new Scanner(System.in);
	System.out.print("Dogdugunuz ay : ");
	int ay = k.nextInt();
	System.out.print("Dogdugunuz gun : ");
	int gun = k.nextInt();
	
	
	
	
	if (ay== 1) {
		if (gun>= 1 && gun<=21) {
			System.out.println("oglak burcu");	
		}
		else {
			System.out.println("kova burcu");	
		}
	}
		
	
	
	else if (ay== 2) {
		if (gun>= 1 && gun<=19) {
			System.out.println("kova burcu");	
		}
		else {
			System.out.println("balik burcu");
		}	
	}	
	
	
	
	else if (ay== 3) {
		if (gun>= 1 && gun<=20) {
			System.out.println("balik burcu");	
		}
		else {
			System.out.println("koc burcu");
		}	
	}	
	
	
	
	else if (ay== 4) {
		if (gun>= 1 && gun<=20) {
			System.out.println("koc burcu");	
		}
		else {
			System.out.println("boga burcu");
			
		}	
	}	
	
		
	
	
	else if (ay== 5) {
		if (gun>= 1 && gun<=21) {
			System.out.println("boga burcu");	
		}
		else {
			System.out.println("ikizler burcu");
			
		}	
	}	
	
	
	
	else if (ay== 6) {
		if (gun>= 1 && gun<=22) {
			System.out.println("ikizler burcu");	
		}
		else {
			System.out.println("yengec burcu");
			
		}	
	}	
	
	
	
	
	else if (ay== 7) {
		if (gun>= 1 && gun<=22) {
			System.out.println("yengec burcu");	
		}
		else {
			System.out.println("aslan burcu");
			
		}	
	}	
	
		
	else if (ay== 8) {
		if (gun>= 1 && gun<=22) {
			System.out.println("aslan burcu");	
		}
		else {
			System.out.println("basak burcu");
			
		}	
	}	
	
		
	
	
	else if (ay== 9) {
		if (gun>= 1 && gun<=22) {
			System.out.println("basak burcu");	
		}
		else {
			System.out.println("terazi burcu");
			
		}	
	}	
	
		
	
	else if (ay== 10) {
		if (gun>= 1 && gun<=22) {
			System.out.println("terazi burcu");	
		}
		else {
			System.out.println("akrep burcu");
			
		}	
	}	
	
		
	
	
	else if (ay== 11) {
		if (gun>= 1 && gun<=21) {
			System.out.println("akrep burcu");	
		}
		else {
			System.out.println("yay burcu");
			
		}	
	}	
	
		
	
	
	
	else if (ay== 12) {
		if (gun<= 1 && gun<=21) {
			System.out.println("yay burcu");	
		}
		else {
			System.out.println("oglak burcu");
			
		}	
	}	
	
	
	
	else {
		System.out.println("Girdiginiz ay ve gun bilgisi hatali lutfen tekrar deneyiniz");
	}
	
	
	
	
	
	/*
	 * kullanicidan alinin gun ve aya gore burc bulma 
	 */
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
