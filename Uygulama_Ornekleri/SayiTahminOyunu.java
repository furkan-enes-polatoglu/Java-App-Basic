package Uygulama_Ornekleri;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner okut = new Scanner(System.in);
		int tahminEdilen, tahminEdilecek;
		Random rastgele = new Random();
		
		
		System.out.println("0-5 arasýnda bir sayý söyle : ");
		tahminEdilen = okut.nextInt(); 
		tahminEdilecek = rastgele.nextInt(5); 
	
		if(tahminEdilen > 5)
		{
			System.out.println("5'ten büyük olamaz !");
			
		}
		if(tahminEdilen > tahminEdilecek)
		{
			System.out.println("Biraz daha aþaðý..");
			tahminEdilen = okut.nextInt(); 
		}
		if(tahminEdilen < tahminEdilecek)
		{
			System.out.println("Biraz yukarý çýk..");
			tahminEdilen = okut.nextInt(); 
		}
		if(tahminEdilen != tahminEdilecek)
		{
			System.out.println("Son þansýný dene : ");
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
