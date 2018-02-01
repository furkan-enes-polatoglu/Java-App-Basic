package Uygulama_Ornekleri;
import java.util.Scanner;

public class FaktoriyelHesapla {
	int girilenSayi;
	Scanner girdi = new Scanner(System.in);

	public int FaktHesapla(int Sayi)
	{
		if(Sayi==1)
		{
			return 1;
		}
		else
		{
			return (Sayi*FaktHesapla(Sayi-1));
		}
		
	}
	
	
	

}
