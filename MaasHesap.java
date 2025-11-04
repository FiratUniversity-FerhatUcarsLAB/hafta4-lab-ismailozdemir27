ismail özdemir 
  250541109
  04.11.2025


import java.util.Scanner;

public class MaasBordrosu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Sabit oranlar
        final double SGK_ORANI = 0.14;
        final double GELIR_VERGISI_ORANI = 0.15;
        final double DAMGA_VERGISI_ORANI = 0.00759;

        // Bilgi girişi
        System.out.print("Çalışan Adı Soyadı: ");
        String adSoyad = input.nextLine();

        System.out.print("Aylık Brüt Maaş (TL): ");
        double brutMaas = input.nextDouble();

        System.out.print("Haftalık Çalışma Saati: ");
        int haftalikSaat = input.nextInt();

        System.out.print("Mesai Saati Sayısı: ");
        int mesaiSaat = input.nextInt();

        // --- HESAPLAMALAR ---
        double mesaiUcreti = (brutMaas / 160) * mesaiSaat * 1.5;
        double toplamGelir = brutMaas + mesaiUcreti;

        double sgk = toplamGelir * SGK_ORANI;
        double gelirVergisi = toplamGelir * GELIR_VERGISI_ORANI;
        double damgaVergisi = toplamGelir * DAMGA_VERGISI_ORANI;
        double toplamKesinti = sgk + gelirVergisi + damgaVergisi;

        double netMaas = toplamGelir - toplamKesinti;

        double kesintiOrani = (toplamKesinti / toplamGelir) * 100;
        double saatlikNetKazanc = netMaas / 176;
        double gunlukNetKazanc = netMaas / 22;

        // --- ÇIKTI ---
        System.out.println("\n====================================");
        System.out.println("           MAAS BORDROSU            ");
        System.out.println("====================================");
        System.out.println("Çalışan: " + adSoyad);
        System.out.println("------------------------------------");
        System.out.println("GELİRLER:");
        System.out.println("Brüt Maaş              : " + String.format("%.2f", brutMaas) + " TL");
        System.out.println("Mesai Ücreti (" + mesaiSaat + " saat): " + String.format("%.2f", mesaiUcreti) + " TL");
        System.out.println("------------------------------------");
        System.out.println("TOPLAM GELİR           : " + String.format("%.2f", toplamGelir) + " TL\n");

        System.out.println("KESİNTİLER:");
        System.out.println("SGK Kesintisi (14.0%)       : " + String.format("%.2f", sgk) + " TL");
        System.out.println("Gelir Vergisi (15.0%)       : " + String.format("%.2f", gelirVergisi) + " TL");
        System.out.println("Damga Vergisi (0.8%)        : " + String.format("%.2f", damgaVergisi) + " TL");
        System.out.println("------------------------------------");
        System.out.println("TOPLAM KESİNTİ         : " + String.format("%.2f", toplamKesinti) + " TL");
        System.out.println("NET MAAŞ               : " + String.format("%.2f", netMaas) + " TL");
        System.out.println("====================================");
        System.out.println("İSTATİSTİKLER:");
        System.out.println("Kesinti Oranı (%)      : " + String.format("%.1f", kesintiOrani) + "%");
        System.out.println("Saatlik Net Kazanç     : " + String.format("%.2f", saatlikNetKazanc) + " TL");
        System.out.println("Günlük Net Kazanç      : " + String.format("%.2f", gunlukNetKazanc) + " TL");
        System.out.println("====================================");
    

        
    }
}  
