/*
 * Ad Soyad: [İsmail ÖZDEMİR]
 * Ogrenci No: [250541109]
 * Tarih: [3.11.2025]
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz
 */

import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
        // Scanner objesi olusturun
        Scanner input = new Scanner ( System.in);
        
        // Degisken tanimlamalari
        // String ad, soyad;
        // int ogrenciNo, yas;
        // double gpa;
        
        
        // Kullanicidan bilgileri alin
        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        System.out.println();
        
        // Ad
        
        
        // Soyad
        
        
        // Ogrenci No
        
        
        // Yas
        
        
        // GPA
        
        
        // Bilgileri ekrana yazdirin
        	  String ad =input.nextLine ();
	  System.out.println(ad);
	  System.out.print("Soyadınızı Girin");
	  String soyad = input.nextLine ();
	  System.out.println(soyad);
	  System.out.print("Yasınız");
	  int yas = input.nextInt();
	  System.out.print("Ogrenci Numaranız:");
	  int ogrNo =input.nextInt();
	  System.out.printf("GPA ");
	  double  GPA =input.nextDouble(); 
	  }
	  }
        System.out.println("\n=== OGRENCI BILGI SISTEMI ===");
        
        // COZUMUNUZU BURAYA YAZIN
    === OGRENCI BILGI SISTEMI===
       Adınız Girin ismail
         ismail
         Soyadınızı Girin özdemir
         özdemir
         Yasınız 20
          Ogrenci Numaranız: 250541109
           GPA  4.80
        
        
        
        
        
        

        
        
        // Scanner'i kapatin (önemli pratik)
        
    }
}
