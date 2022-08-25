import java.util.Scanner;
public class TekSayilariveDordunKatlariOlanSayilariBulanProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner k = new Scanner(System.in);
   int sayi;
    int toplam = 0 ;
    
    do {
    	 System.out.println("sayi giriniz : ");
    	 sayi = k.nextInt();
    	 if (sayi%2==0 && sayi%4==0) {
    		 toplam+=sayi;
    		
    		 System.out.println("toplam: " + toplam); 
    		    
    		 
    	 }
    }
     while (sayi%2==0);
   
    
    
    
    
    
    /*
    
    do {
   	 System.out.println("sayi giriniz : ");
   	 sayi = k.nextInt();
   	 if (sayi%2==1) {
   		 toplam+=sayi;
   		
   		 System.out.println("toplam: " + toplam); 
   		    
   		 
   	 }
   }
    while (sayi>0);
    
    */
  
   
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	}

}
