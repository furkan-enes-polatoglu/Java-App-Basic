import java.util.Scanner;

public class FaktoriyelHesaplama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//METODSUZ FAKT�R�YEL HESAPLAMA
				
				Scanner oku = new Scanner(System.in);
				
				int f=1;
				int sayi=0;
				int i=0;
				System.out.println("Say� giriniz : ");
				sayi = oku.nextInt();
				for(i=2; i<=sayi; i++)
				{
					f = f * i;
				}
				System.out.println("Sonu� = "+f);
				

	}

}
