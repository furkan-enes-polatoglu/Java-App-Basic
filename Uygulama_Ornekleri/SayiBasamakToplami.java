package Uygulama_Ornekleri;
import java.util.Scanner;

public class SayiBasamakToplami {
	
	Scanner girdi = new Scanner(System.in);
	String girilenSayi, cevirilenSayi;
	char basamak;
	int toplam;
	
	public void hesapla()
	{
		System.out.print("Sayýyý giriniz : ");
		girilenSayi=girdi.nextLine();
		for(int i=0; i<girilenSayi.length(); i++ )
		{
			char basamak = girilenSayi.charAt(i);  // 0 1 2 3 diye girilen sayýlarýn basamaklarýna sýrasý ile ulaþýr.
			cevirilenSayi=String.valueOf(basamak); //char'ý string'e dönüþtürmek için valueOf kullanýlýr.
			toplam+=Integer.parseInt(cevirilenSayi);
		}
		System.out.println("Toplam = "+toplam);
		System.out.println(girilenSayi.length());
			
		}
	}
	
	


