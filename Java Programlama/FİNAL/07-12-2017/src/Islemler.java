
public class Islemler {

	// Static yazdýðýmýzda Sýnýfismi class = new Sýnýfismi(); yazmamýza gerek yok.
			//Direk metodu çaðýrmak yeterli.
			
	//TOPLAMA ÝÞLEMÝ
	public static int topla(int a, int b)
	{
		int toplam;
		toplam = a+b;
		return toplam;
	}
	
	//ÜS ALMA ÝÞLEMÝ
	public static int usA(int a, int b)
	{
		int sonuc = 1;
		for(int i=1; i<=b; i++)
		{
			sonuc = sonuc * a;
		}
		return sonuc;
	}
	
	//FAKTÖRÝYEL ÝÞLEMÝ
	public static int faktoriyel(int x)
	{
		int i;
		int sonuc=1;
		for(i=1; i<=x; i++)	// i kendini tekrar 1 ile çarpmasýn ve döngü boþuna bir daha dönmesin diye sayi 2'den baþladý.
		{
			sonuc = sonuc * i;
		}
		return sonuc;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(topla(10,20));
		System.out.println(usA(2,3));
		System.out.println(faktoriyel(5));

		
	}

}
