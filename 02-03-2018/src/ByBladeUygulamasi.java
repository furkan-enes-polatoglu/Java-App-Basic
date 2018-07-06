import java.util.Scanner;

public class ByBladeUygulamasi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("ByBlade Program�na Ho�geldiniz!");
		System.out.println("��kmak i�in Q tu�una bas�n...");
		
		Scanner scanner = new Scanner(System.in);
		
		while(!false)
		{
			System.out.println("Hangi ByBlade'i ��retmek istiyorsunuz?");
			String islem = scanner.nextLine();
			
			if(islem.equals("q"))
			{
				System.out.println("Program kapat�ld�!");
				break;
			}
			else
			{
				ByBladeFabrikasi fabrika = new ByBladeFabrikasi();
				ByBlade beyblade = fabrika.beybladeUret(islem);
				
				if(beyblade==null)
				{
					System.out.println("L�tfen ge�erli bir ByBlade ismi giriniz!");
				}
				else
				{
					beyblade.saldir();
					beyblade.kutsalCanavariOrtayaCikar();
					beyblade.bilgileriGoster();
				}
			}
		}
	}
}
