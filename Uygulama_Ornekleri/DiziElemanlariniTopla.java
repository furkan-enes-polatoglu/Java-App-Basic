package Uygulama_Ornekleri;
import java.util.Random;

public class DiziElemanlariniTopla {
	
	int toplam;
	Random rastgele = new Random();
	int[]sayilar = new int[5];
	
	public void diziyiDoldur() 
	{	
		for(int i=0; i<sayilar.length; i++)
		{
			sayilar[i]=rastgele.nextInt(50);
		}
	}
	public void sayilariTopla()
	{
		for(int i=0; i<sayilar.length; i++)
		{
			toplam = toplam + sayilar[i];
		}
		System.out.println("Toplam = "+toplam);
	}
	
	
	
	

}
