import java.util.Scanner;
public class if_else_hes_mak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int islem;
		System.out.println("Yapacaðýnýz Ýþlemi Seçiniz : ");
		System.out.println("Toplama:1 Çýkarma:2 Çarpma:3 Bölme:4");
		islem = scan.nextInt();


		int a;
		System.out.print("1.Sayýyý giriniz: ");
		a = scan.nextInt();
		int b;
		System.out.print("2.Sayýyý giriniz: ");
		b = scan.nextInt();

		if (islem == 1)
		{
			System.out.print("Ýþlemin sonucu: " + (a + b));
		}

		else if (islem == 2)
		{
			System.out.print("Ýþlemin Sonucu:" + (a - b));
		}

		else if (islem == 3)
		{
			System.out.print("Ýþlemin Sonucu: " + (a * b));
		}

		else if (islem == 4)
		{
			System.out.print("Ýþlemin Sonucu: " + (a / b));
		}
		else
		{
			System.out.println ("Bilinmeyen Ýþlem");
		}

	}

}
