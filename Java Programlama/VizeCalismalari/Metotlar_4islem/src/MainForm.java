import java.util.Scanner;
public class MainForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner oku = new Scanner(System.in);
		int sayi1, sayi2, secenek;
		System.out.println("Yapaca��n�z i�lemi se�iniz  (Toplama:1 ��karma:2 �arpma:3 B�lme:4)");
		secenek = oku.nextInt();
		
		System.out.println("1.Say�y� giriniz : ");
		sayi1 = oku.nextInt();
		System.out.println("2.Say�y� giriniz : ");
		sayi2 = oku.nextInt();
		islem toplamaYap = new islem();
	if(secenek==1)
		System.out.println(toplamaYap.topla(sayi1, sayi2));
	if(secenek==2)
		System.out.println(toplamaYap.cikar(sayi1, sayi2));
	if(secenek==3)
		System.out.println(toplamaYap.carp(sayi1, sayi2));
	if(secenek==4)
		System.out.println(toplamaYap.bol(sayi1, sayi2));
		

	}

}
