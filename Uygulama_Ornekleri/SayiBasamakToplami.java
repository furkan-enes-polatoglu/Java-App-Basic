package Uygulama_Ornekleri;
import java.util.Scanner;

public class SayiBasamakToplami {
	
	Scanner girdi = new Scanner(System.in);
	String girilenSayi, cevirilenSayi;
	char basamak;
	int toplam;
	
	public void hesapla()
	{
		System.out.print("Say�y� giriniz : ");
		girilenSayi=girdi.nextLine();
		for(int i=0; i<girilenSayi.length(); i++ )
		{
			char basamak = girilenSayi.charAt(i);  // 0 1 2 3 diye girilen say�lar�n basamaklar�na s�ras� ile ula��r.
			cevirilenSayi=String.valueOf(basamak); //char'� string'e d�n��t�rmek i�in valueOf kullan�l�r.
			toplam+=Integer.parseInt(cevirilenSayi);
		}
		System.out.println("Toplam = "+toplam);
		System.out.println(girilenSayi.length());
			
		}
	}
	
	


