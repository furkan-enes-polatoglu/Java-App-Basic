import java.util.Scanner;

public class ByBladeUygulamasi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("ByBlade Programýna Hoþgeldiniz!");
		System.out.println("Çýkmak için Q tuþuna basýn...");
		
		Scanner scanner = new Scanner(System.in);
		
		while(!false)
		{
			System.out.println("Hangi ByBlade'i öðretmek istiyorsunuz?");
			String islem = scanner.nextLine();
			
			if(islem.equals("q"))
			{
				System.out.println("Program kapatýldý!");
				break;
			}
			else
			{
				ByBladeFabrikasi fabrika = new ByBladeFabrikasi();
				ByBlade beyblade = fabrika.beybladeUret(islem);
				
				if(beyblade==null)
				{
					System.out.println("Lütfen geçerli bir ByBlade ismi giriniz!");
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
