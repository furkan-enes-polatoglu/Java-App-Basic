import java.util.Scanner;

public class Test {
	//static program çalýþtýðý sürece oluþturulan nesneye eriþebiliriz. Static'in özelliði budur.
	//Doðrudan ismi ile eriþebilmek içinde static kullanýlýr.
	
	private static Sarkicilar sarkicilar = new Sarkicilar();
	private static Scanner scanner = new Scanner(System.in);
	
	public static void islemleri_bastir()
	{
		System.out.println("\t    ### MENÜ ### \n");
		System.out.println("\t 0-Ýþlemleri Görüntüle");
		System.out.println("\t 1-Þarkýcýlarý Görüntüle");
		System.out.println("\t 2-Þarkýcý Ekle");
		System.out.println("\t 3-Þarkýcý Güncelle");
		System.out.println("\t 4-Þarkýcý Sil");
		System.out.println("\t 5-Þarkýcý Ara");
		System.out.println("\t 6-Uygulamadan Çýk \n");
	}
	
	public static void sarkici_goruntule()
	{
		sarkicilar.sarkicilari_goster();
	}
	
	public static void sarkici_ekle()
	{
		System.out.println("Eklemek istediðiniz þarkýcýnýn adýný girin: ");
		String isim = scanner.nextLine();
		sarkicilar.sarkici_ekle(isim);
	}
	
	public static void sarkici_guncelle()
	{
		System.out.println("Güncellemk istedðiniz pozisyonu giriniz (1,2,3...): ");
		int pozisyon = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Güncellemek istediðiniz þarkýcý ismini giriniz: ");
		String isim = scanner.nextLine();
		
		sarkicilar.sarkici_guncelle(pozisyon-1, isim);
	}
	
	public static void sarkici_sil()
	{
		System.out.println("Silmek istediðiniz pozisyonu giriniz: ");
		int pozisyon = scanner.nextInt();
		
		sarkicilar.sarkici_sil(pozisyon-1);
	}
	
	public static void sarkici_ara()
	{
		System.out.println("Aramak istediðiniz þarkýcý ismini giriniz: ");
		String isim = scanner.nextLine();
		sarkicilar.sarkici_ara(isim);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("    Þarkýcý Uygulamasýna Hoþgeldiniz!\n");
		islemleri_bastir();
		
		boolean cikis = false;
		int islem;
		while(!cikis)
		{
			System.out.println("     Yapacaðýnýz iþlemi seçiniz: ");
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
					System.out.println("Hatalý seçim yaptýnýz!");
					islemleri_bastir();
			}
			
		}
		

	}

}
