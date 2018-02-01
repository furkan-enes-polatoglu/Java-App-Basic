import java.util.Scanner;

public class Metotlara_Giris {

	public static void main(String[] args) {
		
		int a = 5;
		System.out.println("A = "+a);
		
		seslen();
		
		yaz();
		
		cagir("Furkan",18);
		
		int sonuc = carp(3,2);
		sonuc = sonuc * 2;
		System.out.println("Çarpým = "+sonuc);
		
		
		//System.out.println("Sonuc = " + carpBol(5,10,2));
		int x = carpBol(10,10,2);
		System.out.println(x);
		
	}
	
	public static void seslen()
	{
		System.out.println("Hey!");
		System.out.println("Nasýlsýn?");
		int a = 5;
		a = 3 * a;
		System.out.println("A = " + a);
	}
	
	public static void yaz()
	{
		int a = 3;
		System.out.println("A = " + a);
	}
	
	public static void cagir(String ad, int yas)
	{
		System.out.println("Benim adým "+ad+", yaþým ise "+yas);
	}
	
	public static int carp(int a, int b)
	{
		int c = a*b;
		return c;
	}
	
	public static int carpBol(int carpan, int carpilan, int bolen)
	{
		return (carpan * carpilan) / bolen;
		
	}



}
