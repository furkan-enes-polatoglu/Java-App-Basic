import java.util.Scanner;

public class FaktoriyelHesaplama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//METODSUZ FAKTÖRÝYEL HESAPLAMA
				
				Scanner oku = new Scanner(System.in);
				
				int f=1;
				int sayi=0;
				int i=0;
				System.out.println("Sayý giriniz : ");
				sayi = oku.nextInt();
				for(i=2; i<=sayi; i++)
				{
					f = f * i;
				}
				System.out.println("Sonuç = "+f);
				

	}

}
