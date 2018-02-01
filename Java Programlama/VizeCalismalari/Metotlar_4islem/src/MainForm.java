import java.util.Scanner;
public class MainForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner oku = new Scanner(System.in);
		int sayi1, sayi2, secenek;
		System.out.println("Yapacaðýnýz iþlemi seçiniz  (Toplama:1 Çýkarma:2 Çarpma:3 Bölme:4)");
		secenek = oku.nextInt();
		
		System.out.println("1.Sayýyý giriniz : ");
		sayi1 = oku.nextInt();
		System.out.println("2.Sayýyý giriniz : ");
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
