Ismail OZDEMIR
  250541109
  4.11.2025
  import java.util.Scanner;
public class GeometrikHesap {

	public static void main(String[] args) {
		// Scanner çağırıldı
		Scanner input = new Scanner (System.in);
		System.out.println("Dairenin Yarıçapını Girin ");
		float yarıçap = input.nextFloat();
		// pi sayısı tanımlandı.
		float pi =3.14159f;
		//Hesapamalar
		System.out.println("SONUÇLAR");
		System.out.println("==============");
		// dairenin alanı çevresi ve çapı bulundu.
		double alan = pi*yarıçap*yarıçap;
		System.out.println("Dairenin Alanı:%.2f cm^2" + alan);
		
		double çevre =2*pi*yarıçap;
		System.out.println("Dairenin Cevresi:%.2f cm" + çevre);
		
		double cap = 2*yarıçap;
		System.out.println("Dairenin Çapı:%.2f cm" + cap);

    //kürenin hacmi ve yuzey alanı bulundu.
    double kure_hacmi = (4.0/3.0) * pi * yarıçap * yarıçap * yarıçap;
		System.out.println("Küre Hacimi: %.2f cm^3" + kure_hacmi);
		
		double kure_yuzey_alanı = 4 * pi * yarıçap * yarıçap ;
		System.out.println("Küre Yuzey alanı: %.2f cm^2" + kure_yuzey_alanı);
		
		
	}

}


Dairenin Yarıçapını Girin 
5
SONUÇLAR
==============
Dairenin Alanı:%.2f cm^278.53974914550781
Dairenin Cevresi:%.2f cm31.41590118408203
Dairenin Çapı:%.2f cm10.0
Küre Hacimi: %.2f cm^3523.5983530680337
Küre Yuzey alanı: %.2f cm^2314.15899658203125

