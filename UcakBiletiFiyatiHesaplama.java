import java.util.Scanner;
public class UcakBiletiFiyatiHesaplama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner k = new Scanner(System.in);
		System.out.print("Yasinizi giriniz : ");
		int yas = k.nextInt();
		System.out.print("Gideceginiz mesafeyi giriniz : ");
		double mesafe = k.nextInt();
		double ucret = mesafe *0.10;
		System.out.print("yol tipini seciniz : 1=> tek yon | 2=> gidis-donus ");
		int yoltip = k.nextInt(); 
	
		
		
	 if(yoltip== 1 || yoltip==2) {
		 System.out.print("1 yada 2"); 
		 yoltip = k.nextInt(); 
		 if (yoltip ==2) {
			  double yolIndirim = ucret* 0.20 ;
			  double bilet= ucret - yolIndirim;
			  
			  if (yas>0 && mesafe>0) {
		    	  
		    	   if  (yas<12) {
		 			  double yasIndirim = ucret * 0.50 ;
		 			double  bilet1 = bilet - yasIndirim; 
		 			System.out.println("Bilet ucreti : "+ bilet1);
		    	   }
		    	   else if (yas>=12 && yas<=24) {
		    		  double yasIndirim = ucret * 0.10;
		    		 double  bilet1 = bilet - yasIndirim; 
		    		 System.out.println("Bilet ucreti : "+ bilet1);
		    	   }
		    	   else {
		    		   double yasIndirim = ucret * 0.30;
		    		   double  bilet1 = bilet - yasIndirim; 
		    		   System.out.println("Bilet ucreti : "+ bilet1);
		    	   }   
		      }
			  
			  else {
				System.out.println("Hatali veri girdiniz");   
			  }   
	    }
					
        else {
		  System.out.println("tek yon gidiste yol indirimi uygulanamaz.");
	    }
	
	 } 	   
	  else {
	   	System.out.println("Yol tipini secmediniz.");
	 }
				
	 	
    }

}
