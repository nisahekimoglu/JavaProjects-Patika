import java.util.Scanner;
public class HesapMakinesiProgrami {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner k = new Scanner (System.in);
       System.out.println("Islem yapmak istediginiz sayilari giriniz :");
       
       int  n1 = k.nextInt();
       int  n2 = k.nextInt();
			
		
       System.out.println("hangi islemi yapmak istersiniz ?");
       System.out.println("1 - toplama islemi");
       System.out.println("2 - cikarma islemi");
       System.out.println("3 - carpmaislemi");
       System.out.println("4 - bolme islemi");
       
     int islem = k.nextInt();;
       
       switch(islem) {
       case 1: 
    	   System.out.println(n1+n2);
    	   break;
    	   
       case 2:   
    	   System.out.println(n1-n2);
    	   break;
		       
       case 3:
    	   System.out.println(n1*n2);
    	   break;
		       
       case 4:
    	   System.out.println(n1/n2);
           break;
    	   
    	default :
    	 System.out.println("Gecersiz islem yaptiniz");
    	  break;
    	   
       }
       
       /*
       System.out.println("hangi islemi yapmak istersiniz ?");
       System.out.println(1 + " toplama islemi");
       System.out.println(2 + " cikarma islemi");
       System.out.println(3 + " carpma islemi");
       System.out.println(4 + " bolme islemi");
       
       int  secim = k.nextInt();
     
       if (secim == 1) {
    	   System.out.println("Sonuc: " + n1+n2);
       }
       else if (secim ==2) {
    	   System.out.println("Sonuc: " + (n1-n2));  
       }
       
       else if (secim == 3) {
    	   System.out.println("Sonuc: " + n1*n2);  
       }
       
       else if (secim == 4) {
    	   System.out.println("Sonuc: "+ n1/n2);  
       }
       
       else {
    	   System.out.println("Yanlis secim yaptiniz ");  
       }
       */
       
      
		
		
	//Videodaki hesap makinesini switch-case kullanarak yapınız.
		
	}

}
