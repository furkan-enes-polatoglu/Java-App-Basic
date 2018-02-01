import java.util.Scanner;
public class Ornekler1 {

	//KEL�MEY� TERS �EV�RME
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
	
	//KA� TANE A VAR?
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
	
	//Kelimeyi �stedi�in Kadar Yazd�rma
	public static void yazdir(String kelime, int kackere)
	{
		int i;
		for(i=1; i<=kackere; i++)
		{
			System.out.println(kelime);
		}
	}
	
	//C�mlede bo�luk say�s� bulma
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
	
	//C�mledeki harf say�s�n� bulma
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
	
	//C�mledeki kelime say�s�n� bulma
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
	
	//Kelime say�s�n� bo�lukSayisi metoduna +1 ekleyerek bulma
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
	
	//Kelimedeki sesli harflerin ka� tane oldu�unu bulma
	public static int sesliSayiSay(String cumle)
	{
		int i;
		String sesliler = "ae�io�u�";
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
	
	//C�mlede istenilen haften ka� tane var?
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
		
		//Ters �evir
		/*
		String kelime;
		Scanner oku = new Scanner(System.in);
		System.out.println("Kelime giriniz");
		kelime = oku.nextLine();
		System.out.println(tersCevir(kelime));
		*/
		
		
		//Ka� tane A var?
		/*
		String kelime;
		Scanner oku = new Scanner(System.in);
		System.out.println("Kelime giriniz : "); 
		kelime = oku.nextLine();
		System.out.println("Sonuc = " + aSay(kelime));
		*/
		
		
		//Kelimeyi �stedi�in Kadar Yazd�rma
		/*
		String kelime;
		int kackere;
		Scanner oku = new Scanner(System.in);
		System.out.println("Kelime giriniz");
		kelime = oku.nextLine();
		System.out.println("Ka� kere yazd�r�ls�n?");
		kackere = oku.nextInt();
		yazdir(kelime,kackere);
		*/
		
		
		//C�mlede bo�luk say�s� bulma
		/*
		String cumle;
		Scanner oku = new Scanner(System.in);
		System.out.println("C�mle giriniz : ");
		cumle = oku.nextLine();
		System.out.println("Bo�luk say�s� = " + boslukSayisi(cumle));
		*/
		
		
		//C�mledeki harf say�s�n� bulma
		/*
		String cumle;
		Scanner oku = new Scanner(System.in);
		System.out.println("C�mle giriniz");
		cumle = oku.nextLine();
		System.out.println("Harf say�s� = " + harfSayisi(cumle));
		*/
		
		
		//C�mledeki kelime say�s�n� bulma
		/*
		String cumle;
		Scanner oku = new Scanner(System.in);
		System.out.println("C�mle giriniz\n");
		cumle = oku.nextLine();
		System.out.println("Kelime say�s� = " + kelimeSayisi(cumle));
		*/
		
		
		//Kelime say�s�n� bo�lukSayisi metoduna +1 ekleyerek bulma
		/*
		String cumle;
		Scanner oku = new Scanner(System.in);
		System.out.println("C�mle giriniz");
		cumle = oku.nextLine();
		System.out.println("Kelime say�s� = " + kelimeSayisi2(cumle));
		*/
		
		
		//Kelimedeki sesli harflerin ka� tane oldu�unu bulma
		/*
		String kelime;
		Scanner oku = new Scanner(System.in);
		System.out.println("Kelime giriniz ");
		kelime = oku.nextLine();
		System.out.println("Sesli harfler = " + sesliSayiSay(kelime));
		*/
		
		
		//C�mlede istenilen haften ka� tane var?
		/*
		Scanner oku = new Scanner(System.in);
		String cumle;
		char harf;
		System.out.println("C�mle giriniz ");
		cumle = oku.nextLine();
		System.out.println("Aranacak harfi giriniz ");
		harf = oku.next().charAt(0);
		System.out.println("Sonu� = " + harfsay(cumle, harf));
		*/
		


	}

}
