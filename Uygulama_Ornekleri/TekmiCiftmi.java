package Uygulama_Ornekleri;

import java.util.Scanner;

public class TekmiCiftmi {
	
	Scanner imput = new Scanner(System.in);
	int tekSayi, ciftSayi, girilenSayi;
	
	public void analizEt() {
		
	for(int x=1; x<=5; x++) {
		System.out.print(x+".say�y� giriniz : ");
		girilenSayi = imput.nextInt();
		if(girilenSayi % 2 == 0) {
			ciftSayi++;
		} else {
			tekSayi++;
		}
	}
	System.out.println(ciftSayi + " adet �ift say� vard�r.");
	System.out.println(tekSayi + " adet tek say� vard�r.");
	
	}
	
	public void say()
	{
		for(int x=1; x<=50; x++)
		{
			System.out.print(x + " ");
		}
	}
}
