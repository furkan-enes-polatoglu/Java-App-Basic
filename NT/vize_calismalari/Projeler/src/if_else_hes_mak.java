import java.util.Scanner;
public class if_else_hes_mak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int islem;
		System.out.println("Yapaca��n�z ��lemi Se�iniz : ");
		System.out.println("Toplama:1 ��karma:2 �arpma:3 B�lme:4");
		islem = scan.nextInt();


		int a;
		System.out.print("1.Say�y� giriniz: ");
		a = scan.nextInt();
		int b;
		System.out.print("2.Say�y� giriniz: ");
		b = scan.nextInt();

		if (islem == 1)
		{
			System.out.print("��lemin sonucu: " + (a + b));
		}

		else if (islem == 2)
		{
			System.out.print("��lemin Sonucu:" + (a - b));
		}

		else if (islem == 3)
		{
			System.out.print("��lemin Sonucu: " + (a * b));
		}

		else if (islem == 4)
		{
			System.out.print("��lemin Sonucu: " + (a / b));
		}
		else
		{
			System.out.println ("Bilinmeyen ��lem");
		}

	}

}
