
public class Islemler {

	// Static yazd���m�zda S�n�fismi class = new S�n�fismi(); yazmam�za gerek yok.
			//Direk metodu �a��rmak yeterli.
			
	//TOPLAMA ��LEM�
	public static int topla(int a, int b)
	{
		int toplam;
		toplam = a+b;
		return toplam;
	}
	
	//�S ALMA ��LEM�
	public static int usA(int a, int b)
	{
		int sonuc = 1;
		for(int i=1; i<=b; i++)
		{
			sonuc = sonuc * a;
		}
		return sonuc;
	}
	
	//FAKT�R�YEL ��LEM�
	public static int faktoriyel(int x)
	{
		int i;
		int sonuc=1;
		for(i=1; i<=x; i++)	// i kendini tekrar 1 ile �arpmas�n ve d�ng� bo�una bir daha d�nmesin diye sayi 2'den ba�lad�.
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
