import java.util.Scanner;
public class HavaDurumunaGoreEtkinlikBelirleyenProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner k = new Scanner(System.in);
 System.out.print("Bugun hava kac derece : ");
 double derece = k.nextInt();
    
    if (derece>= 25) {
    	System.out.println("Yuzebilirsiniz");
    }
    else if (derece >=15 && derece <25) {
    	System.out.println("Piknik yapabilirsiniz");
    }
    else if (derece >=5 && derece< 15 ) {
    	System.out.println("Sinemaya gidebilirsiniz");
    }
    
    else if (derece <5 && derece >= -10) {
    	System.out.println( "Kayak yapabilirsiniz");
    	
    }
    
    else {
    	System.out.println("Hava sartlari hicbir etkinlik icin uygun degil. \nSagliginiz ve guvenliginiz icin lutfen evinizde kalin !");
    }
   
    
    
    
    
 
	}

}
