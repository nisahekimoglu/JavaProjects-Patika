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
		else if (gun>=22 && gun<=31){
			System.out.println("kova burcu");		
		}
		else {
			System.out.println("girilen gun yanlis, tekrar deneyiniz");	
		}
	}
		
	
	
	else if (ay== 2) {
		if (gun>= 1 && gun<=19) {
			System.out.println("kova burcu");	
		}
		else if (gun>=20 && gun<=28){
			System.out.println("balik burcu");		
		}
		else {
			System.out.println("girilen gun yanlis, tekrar deneyiniz");	
		}
	}	
	
	
	
	else if (ay== 3) {
		if (gun>= 1 && gun<=20) {
			System.out.println("balik burcu");	
		}
		else if (gun>=21 && gun<=31){
			System.out.println("koc burcu");		
		}
		else {
			System.out.println("girilen gun yanlis, tekrar deneyiniz");	
		}
	}	
	
	
	
	else if (ay== 4) {
		if (gun>= 1 && gun<=20) {
			System.out.println("koc burcu");	
		}
		else if (gun>=21 && gun<=30){
			System.out.println("boga burcu");		
		}
		else {
			System.out.println("girilen gun yanlis, tekrar deneyiniz");	
		}	
	}	
	
		
	
	
	else if (ay== 5) {
		if (gun>= 1 && gun<=21) {
			System.out.println("boga burcu");	
		}
		else if (gun>=22 && gun<=31){
			System.out.println("ikizler burcu");		
		}
		else {
			System.out.println("girilen gun yanlis, tekrar deneyiniz");	
		}	
	}	
	
	
	
	else if (ay== 6) {
		if (gun>= 1 && gun<=22) {
			System.out.println("ikizler burcu");	
		}
		else if (gun>=23 && gun<=30){
			System.out.println("yengec burcu");		
		}
		else {
			System.out.println("girilen gun yanlis, tekrar deneyiniz");	
		}	
	}	
	
	
	
	
	else if (ay== 7) {
		if (gun>= 1 && gun<=22) {
			System.out.println("yengec burcu");	
		}
		else if (gun>=23 && gun<=31){
			System.out.println("aslan burcu");		
		}
		else {
			System.out.println("girilen gun yanlis, tekrar deneyiniz");	
		}	
	}	
	
		
	else if (ay== 8) {
		if (gun>= 1 && gun<=22) {
			System.out.println("aslan burcu");	
		}
		else if (gun>=23 && gun<=31){
			System.out.println("basak burcu");		
		}
		else {
			System.out.println("girilen gun yanlis, tekrar deneyiniz");	
		}	
	}	
	
		
	
	
	else if (ay== 9) {
		if (gun>= 1 && gun<=22) {
			System.out.println("basak burcu");	
		}
		else if (gun>=23 && gun<=30){
			System.out.println("terazi burcu");		
		}
		else {
			System.out.println("girilen gun yanlis, tekrar deneyiniz");	
		}	
	}	
	
		
	
	else if (ay== 10) {
		if (gun>= 1 && gun<=22) {
			System.out.println("terazi burcu");	
		}
		else if (gun>=23 && gun<=31){
			System.out.println("akrep burcu");		
		}
		else {
			System.out.println("girilen gun yanlis, tekrar deneyiniz");	
		}	
	}	
	
		
	
	
	else if (ay== 11) {
		if (gun>= 1 && gun<=21) {
			System.out.println("akrep burcu");	
		}
		else if (gun>=22 && gun<=30){
			System.out.println("yay burcu");		
		}
		else {
			System.out.println("girilen gun yanlis, tekrar deneyiniz");	
		}	
	}	
	
		
	
	
	
	else if (ay== 12) {
		if (gun<= 1 && gun<=21) {
			System.out.println("yay burcu");	
		}
		else if (gun>=22 && gun<=31){
			System.out.println("oglak burcu");		
		}
		else {
			System.out.println("girilen gun yanlis, tekrar deneyiniz");	
		}	
	}	
	
	
	
	else {
		
		System.out.println("Girdiginiz ay bilgisi hatali lutfen tekrar deneyiniz");
	}
	
	
	
	
	/*
	 * kullanicidan alinin gun ve aya gore burc bulma 
	 */
	
	
		
	}

}
