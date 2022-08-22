import java.util.Scanner;
public class ArtikYilHesaplayanProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner k = new Scanner(System.in);
      System.out.print("Yil giriniz : ");
      int yil = k.nextInt();

    
    	  
    	 if (yil%100!=0 ) {
    		 
    		 if (yil%4==0) System.out.println(yil + " Artik yil");  
    		
    		 else  System.out.println("artik yil degildir//"); 
    	 }
    	 
    	 else if (yil%400==0)  {
    		 System.out.println(yil + " Artik yildir.");
    	 }
    	 
    	 else {
    		 System.out.println("artik yil degildir/");
    	 }
    		 
    		 
    		 
    		 
    
      
	}

}
