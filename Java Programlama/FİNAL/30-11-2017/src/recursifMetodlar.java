import java.util.Scanner;

public class recursifMetodlar {

	// ÖZYÝNELEME
	
	public static int geriyeSay(int sayi)
	{
		if(sayi==0)
			return 1;
		
		
		int sayi2 = sayi/geriyeSay(sayi/2);
		return sayi2;
	}
	
	
	public static long recursiffaktoriyelhesapla(int sayi)
	{
		if(sayi==0 || sayi==1)
		{
			return 1;
		}
		
		long sonuc = sayi*recursiffaktoriyelhesapla(sayi-1);
		return sonuc;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//0'DAN 21'E KADAR OLAN SAYILARIN FAKTÖRÝYELÝNÝ HESAPLA
		
		for(int i=0; i<21; i++)
		{
			long fakt = recursiffaktoriyelhesapla(i);
			System.out.println(i+"!="+fakt);
		}
		
		/*
		int sayi;
		Scanner oku = new Scanner(System.in);
		System.out.println("Sayi:");
		sayi = oku.nextInt();
		System.out.println(geriyeSay(sayi));
		*/
	}

}
