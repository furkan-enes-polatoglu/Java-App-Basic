package Uygulama_Ornekleri;
import java.util.Scanner;

public class EnBuyEnKuc {
	Scanner girdi = new Scanner(System.in);
	int girilenSayi, enBuyukSayi=0, enKucukSayi;
	
	public void bul()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("Bir say� giriniz : ");
			girilenSayi = girdi.nextInt();
			
			if(i==0)
			{
				enKucukSayi = girilenSayi;
						
			}
			
			if(girilenSayi > enBuyukSayi)
			{
				enBuyukSayi = girilenSayi;
			}
			else if(girilenSayi < enKucukSayi)
			{
				enKucukSayi = girilenSayi;
			}
			
		}
		System.out.println("En b�y�k say� = "+enBuyukSayi);
		System.out.println("En k���k say� = "+enKucukSayi);
	}
	
	
	

}
