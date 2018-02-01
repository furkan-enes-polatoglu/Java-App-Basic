import java.util.Random;
import java.util.Scanner;

public class DenemeSayfasi  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		adSoyle();
		adYasSoyle("Birgül",40);
		System.out.println( "Çarpým sonucu = " + carp(3,2) );
		System.out.println( "Sonuç = " + toplaCarp(10,6,2) );
		komple();
		
	}
	public static void adSoyle()
	{
		System.out.println("Benim adým Furkan");
	}
	public static void adYasSoyle(String ad, int yas)
	{
		System.out.println("Benim adým " +ad+" yaþým ise "+yas+ ".");
	}
	public static int carp(int sayi1, int sayi2)
	{
		return sayi1 * sayi2;
	}
	public static int toplaCarp(int x, int y, int z)
	{
		return (x+y)/z;
	}
	public static void komple()
	{
		System.out.println("Þimdi sana tek satýrda çok þey yapacaðým");
		int a=20;
		int b=5;
		int toplam = a+b;
		int fark = a-b;
		int carpim = a*b;
		int bolme = a/b;
		
		System.out.println("Sayýlarýn toplamý = " + toplam);
		System.out.println("Sayýlarýn farký = " + fark);
		System.out.println("Sayýlarýn çarpýmý = " + carpim);
		System.out.println("Sayýlarýn bölümü = " + bolme);
		
		
		
		
	/*	Scanner oku = new Scanner(System.in);
		String isim;
		System.out.println("Ýsminiz nedir?");
		isim = oku.nextLine();
		if(isim.equalsIgnoreCase("Furkan"))
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("3");
		}
	*/
		
	/*	Scanner okut = new Scanner(System.in);
		int sayi;
		System.out.println("Kaç tane sayý yazdýrýlsýn?");
		sayi = okut.nextInt();
		if(sayi==5)
		{
			int sayii;
			for(sayii=1; sayii<=5; sayii++)
			{
				System.out.print(sayii + " ");
			}
		}
		if(sayi == 100)
		{
			int sayi3;
			for(sayi3=1; sayi3<=100; sayi3++)
			{
				System.out.print(sayi3 + " ");
			}
		}
		
	*/
		
		
		
	}

}
