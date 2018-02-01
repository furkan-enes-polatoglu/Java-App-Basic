import java.util.Scanner;
public class MatOrnekler1 {

	
	//Kelimede kaç tane sayý var
	public static int rakamSay(String kelime)
	{
		int i;
		int sonuc=0;
		for(i=0; i<kelime.length(); i++)
		{
			if(Character.isDigit(kelime.charAt(i)))
			{
				sonuc++;
			}
		}
		return sonuc;
	}
	
	
	//Üs alma 
	public static int usAl(int sayi, int ussu)
	{
		int i;
		int sonuc=1;
		for(i=1; i<=ussu; i++)
		{
			sonuc = sonuc * sayi;
		}
		return sonuc;
	}
	
	
	//Faktöriyel bulma
	public static int faktoriyel(int sayi)
	{
		int i;
		int sonuc=1;
		for(i=1; i<=sayi; i++)
		{
			sonuc = sonuc*i;
		}
		return sonuc;
	}
	
	//Recursive ile Faktöriyel
	public static int fakt(int sayi)
	{
		if(sayi==0 || sayi==1)
			return 1;
		
		int sonuc = sayi*fakt(sayi-1);
		return sonuc;
	}
	
	//Normal faktöriyel
	public static int faktN(int sayi)
	{
		int f=1;
		for(int i=1; i<=sayi; i++)
		{
			f = f*i;
		}
		return f;
	}
	
	//Normal faktöriyel 2
	public static int faktN2(int sayi)
	{
		int f=1;
		while(sayi>1)
		{
			f=f*sayi;
			sayi--;
		}
		return f;
	}
	
	public static void main(String[] args) {
		
		/*
		Scanner oku = new Scanner(System.in);
		int sayi;
		System.out.println("Sayý gir : ");
		sayi = oku.nextInt();
		System.out.println("Sonuc = "+faktN2(sayi));
		*/
		
		
		
		/*
		Scanner oku = new Scanner(System.in);
		int sayi;
		System.out.println("Sayý gir : ");
		sayi = oku.nextInt();
		System.out.println("Sonuc = "+faktN(sayi));
		*/
		
		
		
		//Kelimede kaç tane sayý var
		/*
		Scanner oku = new Scanner(System.in);
		String kelime;
		System.out.println("Kelime giriniz  ");
		kelime = oku.nextLine();
		System.out.println("Rakam sayýsý = " + rakamSay(kelime));
		*/
		
		
		//Üs alma
		/*
		Scanner oku = new Scanner(System.in);
		int sayi, ussu;
		System.out.println("Sayý giriniz");
		sayi = oku.nextInt();
		System.out.println("Üssü giriniz");
		ussu = oku.nextInt();
		System.out.println("Sonuc : " + usAl(sayi, ussu));
		*/
		
		
		//Faktöriyel bulma
		/*
		Scanner oku = new Scanner(System.in);
		int sayi;
		System.out.println("Sayý giriniz");
		sayi = oku.nextInt();
		System.out.println("Sonuc : " + faktoriyel(sayi));
		*/
		
		
		//Recursive ile Faktöriyel
		/*
		Scanner oku = new Scanner(System.in);
		int sayi;
		System.out.println("Sayý giriniz");
		sayi = oku.nextInt();
		System.out.println("Sonuc : " + fakt(sayi));
		*/
		

		
	}

}
