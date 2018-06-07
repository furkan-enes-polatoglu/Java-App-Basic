public class Ders_17_03 {
	
	public static void mesaj()
	{
		System.out.println("Parametresiz metot çaðýrýldý");
	}
	public static String mesaj(String gelenMesaj)
	{
		String a = gelenMesaj;
		return a;
	}
	public static int mesaj(int a)
	{
		int sayi = 50;
		sayi += a; //sayi = sayi + a
		return sayi;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mesaj();
		String gelenDeger = mesaj("Parametreli metot çaðrýldý");
		System.out.println(gelenDeger);
		System.out.println(mesaj(5));
	}

}
