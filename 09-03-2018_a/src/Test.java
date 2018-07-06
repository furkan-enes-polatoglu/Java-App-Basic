import java.util.Scanner;

public class Test {
	//static program �al��t��� s�rece olu�turulan nesneye eri�ebiliriz. Static'in �zelli�i budur.
	//Do�rudan ismi ile eri�ebilmek i�inde static kullan�l�r.
	
	private static Sarkicilar sarkicilar = new Sarkicilar();
	private static Scanner scanner = new Scanner(System.in);
	
	public static void islemleri_bastir()
	{
		System.out.println("\t    ### MEN� ### \n");
		System.out.println("\t 0-��lemleri G�r�nt�le");
		System.out.println("\t 1-�ark�c�lar� G�r�nt�le");
		System.out.println("\t 2-�ark�c� Ekle");
		System.out.println("\t 3-�ark�c� G�ncelle");
		System.out.println("\t 4-�ark�c� Sil");
		System.out.println("\t 5-�ark�c� Ara");
		System.out.println("\t 6-Uygulamadan ��k \n");
	}
	
	public static void sarkici_goruntule()
	{
		sarkicilar.sarkicilari_goster();
	}
	
	public static void sarkici_ekle()
	{
		System.out.println("Eklemek istedi�iniz �ark�c�n�n ad�n� girin: ");
		String isim = scanner.nextLine();
		sarkicilar.sarkici_ekle(isim);
	}
	
	public static void sarkici_guncelle()
	{
		System.out.println("G�ncellemk isted�iniz pozisyonu giriniz (1,2,3...): ");
		int pozisyon = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("G�ncellemek istedi�iniz �ark�c� ismini giriniz: ");
		String isim = scanner.nextLine();
		
		sarkicilar.sarkici_guncelle(pozisyon-1, isim);
	}
	
	public static void sarkici_sil()
	{
		System.out.println("Silmek istedi�iniz pozisyonu giriniz: ");
		int pozisyon = scanner.nextInt();
		
		sarkicilar.sarkici_sil(pozisyon-1);
	}
	
	public static void sarkici_ara()
	{
		System.out.println("Aramak istedi�iniz �ark�c� ismini giriniz: ");
		String isim = scanner.nextLine();
		sarkicilar.sarkici_ara(isim);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("    �ark�c� Uygulamas�na Ho�geldiniz!\n");
		islemleri_bastir();
		
		boolean cikis = false;
		int islem;
		while(!cikis)
		{
			System.out.println("     Yapaca��n�z i�lemi se�iniz: ");
			islem = scanner.nextInt();
			scanner.nextLine();
			
			switch(islem)
			{
				case 0:
					islemleri_bastir(); break;
				case 1:
					sarkici_goruntule(); break;
				case 2:
					sarkici_ekle(); break;
				case 3:
					sarkici_guncelle(); break;
				case 4:
					sarkici_sil(); break;
				case 5:
					sarkici_ara(); break;
				case 6:
					cikis=true;
					break;
				default:
					System.out.println("Hatal� se�im yapt�n�z!");
					islemleri_bastir();
			}
			
		}
		

	}

}
