package Uygulama_Ornekleri;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner okut = new Scanner(System.in);
		int tahminEdilen, tahminEdilecek;
		Random rastgele = new Random();
		
		
		System.out.println("0-5 aras�nda bir say� s�yle : ");
		tahminEdilen = okut.nextInt(); 
		tahminEdilecek = rastgele.nextInt(5); 
	
		if(tahminEdilen > 5)
		{
			System.out.println("5'ten b�y�k olamaz !");
			
		}
		if(tahminEdilen > tahminEdilecek)
		{
			System.out.println("Biraz daha a�a��..");
			tahminEdilen = okut.nextInt(); 
		}
		if(tahminEdilen < tahminEdilecek)
		{
			System.out.println("Biraz yukar� ��k..");
			tahminEdilen = okut.nextInt(); 
		}
		if(tahminEdilen != tahminEdilecek)
		{
			System.out.println("Son �ans�n� dene : ");
			tahminEdilen = okut.nextInt();
		}
		if(tahminEdilen==tahminEdilecek)
		{
			System.out.println("Beni buldun : "+tahminEdilecek);
		}
		else
		{
			System.out.println("Maalesef kaybettin :(");
		}

	}

}
