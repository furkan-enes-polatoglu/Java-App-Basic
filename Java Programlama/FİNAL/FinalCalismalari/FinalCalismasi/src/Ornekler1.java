import java.util.Scanner;
public class Ornekler1 {

	//KELÝMEYÝ TERS ÇEVÝRME
	public static String tersCevir(String kelime)
	{
		int i;
		String sonuc = "";
		for(i=kelime.length()-1; i>=0; i--)
		{
			sonuc = sonuc + kelime.charAt(i);
		}	
		return sonuc;
	}
	
	//KAÇ TANE A VAR?
	public static int aSay(String kelime)
	{
		int i;
		int adet=0;
		char harf='a';
		for(i=0; i<kelime.length(); i++)
		{
			if(kelime.charAt(i)==harf)
			{
				adet = adet + 1;
			}
		}
		return adet;
	}
	
	//Kelimeyi Ýstediðin Kadar Yazdýrma
	public static void yazdir(String kelime, int kackere)
	{
		int i;
		for(i=1; i<=kackere; i++)
		{
			System.out.println(kelime);
		}
	}
	
	//Cümlede boþluk sayýsý bulma
	public static int boslukSayisi(String cumle)
	{
		int i;
		int bosluk=0;
		for(i=0; i<cumle.length(); i++)
		{
			if(cumle.charAt(i)==' ')
			{
				bosluk = bosluk + 1;
			}
		}
		return bosluk;
	}
	
	//Cümledeki harf sayýsýný bulma
	public static int harfSayisi(String cumle)
	{
		int i;
		int harfsayisi = cumle.length();
		for(i=0; i<cumle.length(); i++)
		{
			if(cumle.charAt(i)==' ')
			{
				harfsayisi--;
			}
		}
		return harfsayisi;
	}
	
	//Cümledeki kelime sayýsýný bulma
	public static int kelimeSayisi(String cumle)
	{
		int i;
		int kelimeadedi = 1;
		for(i=0; i<cumle.length(); i++)
		{
			if(cumle.charAt(i)==' ')
			{
				kelimeadedi++;
			}
		}
		return kelimeadedi;
	}
	
	//Kelime sayýsýný boþlukSayisi metoduna +1 ekleyerek bulma
	public static int kelimeSayisi2(String cumle)
	{
		int i;
		int kelimesayisi=0;
		for(i=0; i<cumle.length(); i++)
		{
			if(cumle.charAt(i)==' ')
			{
				kelimesayisi = boslukSayisi(cumle) + 1;
			}
		}
		return kelimesayisi;
	}
	
	//Kelimedeki sesli harflerin kaç tane olduðunu bulma
	public static int sesliSayiSay(String cumle)
	{
		int i;
		String sesliler = "aeýioöuü";
		int adet = 0;
		for(i=0; i<cumle.length(); i++)
		{
			if(sesliler.indexOf(cumle.charAt(i))!=-1)
			{
				adet++;
			}
		}
		return adet;
	}
	
	//Cümlede istenilen haften kaç tane var?
	public static int harfsay(String cumle, char harf)
	{
		int i;
		int adet=0;
		for(i=0; i<cumle.length(); i++)
		{
			if(cumle.charAt(i)==harf)
			{
				adet++;
			}
		}
		return adet;
	}

	
	
	public static void main(String[] args) {
		
		//Ters Çevir
		/*
		String kelime;
		Scanner oku = new Scanner(System.in);
		System.out.println("Kelime giriniz");
		kelime = oku.nextLine();
		System.out.println(tersCevir(kelime));
		*/
		
		
		//Kaç tane A var?
		/*
		String kelime;
		Scanner oku = new Scanner(System.in);
		System.out.println("Kelime giriniz : "); 
		kelime = oku.nextLine();
		System.out.println("Sonuc = " + aSay(kelime));
		*/
		
		
		//Kelimeyi Ýstediðin Kadar Yazdýrma
		/*
		String kelime;
		int kackere;
		Scanner oku = new Scanner(System.in);
		System.out.println("Kelime giriniz");
		kelime = oku.nextLine();
		System.out.println("Kaç kere yazdýrýlsýn?");
		kackere = oku.nextInt();
		yazdir(kelime,kackere);
		*/
		
		
		//Cümlede boþluk sayýsý bulma
		/*
		String cumle;
		Scanner oku = new Scanner(System.in);
		System.out.println("Cümle giriniz : ");
		cumle = oku.nextLine();
		System.out.println("Boþluk sayýsý = " + boslukSayisi(cumle));
		*/
		
		
		//Cümledeki harf sayýsýný bulma
		/*
		String cumle;
		Scanner oku = new Scanner(System.in);
		System.out.println("Cümle giriniz");
		cumle = oku.nextLine();
		System.out.println("Harf sayýsý = " + harfSayisi(cumle));
		*/
		
		
		//Cümledeki kelime sayýsýný bulma
		/*
		String cumle;
		Scanner oku = new Scanner(System.in);
		System.out.println("Cümle giriniz\n");
		cumle = oku.nextLine();
		System.out.println("Kelime sayýsý = " + kelimeSayisi(cumle));
		*/
		
		
		//Kelime sayýsýný boþlukSayisi metoduna +1 ekleyerek bulma
		/*
		String cumle;
		Scanner oku = new Scanner(System.in);
		System.out.println("Cümle giriniz");
		cumle = oku.nextLine();
		System.out.println("Kelime sayýsý = " + kelimeSayisi2(cumle));
		*/
		
		
		//Kelimedeki sesli harflerin kaç tane olduðunu bulma
		/*
		String kelime;
		Scanner oku = new Scanner(System.in);
		System.out.println("Kelime giriniz ");
		kelime = oku.nextLine();
		System.out.println("Sesli harfler = " + sesliSayiSay(kelime));
		*/
		
		
		//Cümlede istenilen haften kaç tane var?
		/*
		Scanner oku = new Scanner(System.in);
		String cumle;
		char harf;
		System.out.println("Cümle giriniz ");
		cumle = oku.nextLine();
		System.out.println("Aranacak harfi giriniz ");
		harf = oku.next().charAt(0);
		System.out.println("Sonuç = " + harfsay(cumle, harf));
		*/
		


	}

}
