import java.util.Scanner;

//kullanýcýnýn istediði harften kaç tane var??? bu örnekte metodun parametresi char olmalý.
//bosluk-1  >>>  harf sayýsýný verir (Bilgisayar Programcýlýðý için)
//bosluk+1 >>>  2 kelime  -   bosluk+2  >>>  3 kelime olur
//length() >> komutunu yaz

public class OrnekToplu {
	
	public static int bosluksayisi(String cumle)
	{
		int uzunluk = cumle.length();
		int bosluk=0;
		
		for(int i=0; i<uzunluk; i++)
		{
			if(cumle.charAt(i)==' ') //char dediðimiz için tek týrnak.
			{
				bosluk++;
			}
		}
		return bosluk;
	}
	
	
	public static int harfsayisi(String cumle)
	{
		int i;
		int uzunluk = cumle.length();
		for(i=0; i<uzunluk; i++);
		{
			if(cumle.charAt(i)==' ')
			{
				uzunluk--;
			}
		}
		return uzunluk;
	}

	public static int kelimesayisi(String cumle)
	{
		int i;
		int uzunluk = cumle.length();
		int kelimeadedi = 1;
		for(i=0; i<uzunluk; i++)
		{
			if(cumle.charAt(i)==' ')
			{
				kelimeadedi++;
			}
		}
		return kelimeadedi;
	}
	
	public static int kelimesayisi2(String cumle)
	{
		int i;
		int adet=0;
		
		for(i=0; i<cumle.length(); i++)
		{
			if(cumle.charAt(i)==' ')
			{
				adet = bosluksayisi(cumle) +1;
			}
		}
		return adet;
		
	}
	


	public static int sesliSayi(String cumle)
	{
		int i;
		String sesliler = "aeýioöuü";
		int adet = 0;
		int uzunluk = cumle.length();
		for(i=0; i<uzunluk; i++)
		{
			if(sesliler.indexOf(cumle.charAt(i))!=-1)
			{
				adet++;
			}
		}
		return adet;
	}
	
	
	public static void main(String[] args) {
		
		Scanner oku = new Scanner(System.in);
		//System.out.println(kelimesayisi2("furkan enes polatoðlu berk kirgiz"));
		System.out.println(sesliSayi("aa"));


		
		
	}

}
