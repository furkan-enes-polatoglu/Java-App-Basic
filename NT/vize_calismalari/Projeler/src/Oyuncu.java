
public class Oyuncu {
	
	public Oyuncu(String a)
	{
		System.out.println("1 Parametre De�eri Geldi : "+a);

	}
	public Oyuncu()
	{
		System.out.println("Parametresiz Metot �a��r�ld�.");
	}
	
	String isim;
	int yas;
	String yazi;

	void isimTemizle()
	{
		isim="";
	}
	void yasSifirla() 
	{
		yas=0;
	}

}
