import java.util.Scanner;

public class Input_Veri_Alma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner scan = new Scanner(System.in);
		
		int secenek;
		int a, b;
		boolean calistir = true;
		
		System.out.println("Se�ene�i giriniz : ");
	
		secenek = scan.nextInt();
		
		a = 5;
		b = 7;
		
		if(secenek == 0)
		{
			System.out.println("A + B = "+(a+b));
		}
		if(secenek == 1)
		{
			System.out.println("A - B = "+(a-b));
		}
		if(secenek == 2)
		{
			System.out.println("A * B = "+(a*b));
		}
		System.out.println("Program�n Sonu!");
	
		
	/*	
	    Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.print("A = ");
		a = sc.nextInt();
		System.out.print("B = ");
		b = sc.nextInt();
		System.out.println(a + " + " + b + " = " + (a+b));
		
	*/
		
		
		
		
		
		
	/*	Scanner scan = new Scanner(System.in);
		
		String yazi;
		System.out.print("Ad�n�z : ");
		yazi = scan.nextLine();
		System.out.println("Merhaba "+yazi+", nas�ls�n?");
		
		int yas;
		System.out.print("Ya��n�z : ");
		yas = scan.nextInt();
		
		int dogum = 2017-yas;
		System.out.println("Ooo, "+dogum+" y�l�nda do�mu�sunuz...");
	*/
		
	}

}
