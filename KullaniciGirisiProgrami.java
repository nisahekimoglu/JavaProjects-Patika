import java.util.Scanner;
public class KullaniciGirisiProgrami {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String kullaniciAdi = "nisa";
		String kullaniciSifre = "0987";	
		
    Scanner k = new Scanner(System.in);
   
    System.out.print("Kullanici adinizi giriniz: ");
    String admin= k.nextLine();
    
    System.out.print("Sifrenizi giriniz: ");
    String parola = k.nextLine();
    
    
    
         if (!kullaniciAdi.equals(admin) && !kullaniciSifre.equals(parola)) {
        	 System.out.println("Kullanici adi ve parola yanlis tekrar deneyiniz "); 
    	   
         }
         
         else if (kullaniciAdi.equals(admin) && !kullaniciSifre.equals(parola)) {
        	 System.out.println("Parola yanlis , sifirlamak ister misiniz ?\n evet/hayir "); 
     	     
     	    String kullCevap =k.nextLine();
        	 
             
                 String cevap = "evet";
         	 boolean sonuc = cevap.equals(kullCevap);
         	 String sonuc2 = sonuc ? "Yeni sifrenizi giriniz" : "sistem hatasi tekrar deneyiniz" ;
         
        	 
        	 System.out.println(sonuc2);
        	 String yeniSifre = k.nextLine();
      	   
      	   
        	 
        	     if (yeniSifre.equals(kullaniciSifre)) {
        		 System.out.println("Eski parola ile yeni parola ayni olamaz, tekrar deneyiniz ");
       		 
        	      }
        	 
        	     else {
        		 System.out.println("Yeni sifre olusturuldu"); 
        	     }
        	
         }
      	 
      	 else {
      		System.out.println("Parola dogru giris basarili ");  
      		
         }
      	 
    

/*
 * Kullanici adi ve sifeyi kontrol eden programi yapiniz
 * Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, 
 * eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile 
 * aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana
 * "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
 */
		
		
	}

}
