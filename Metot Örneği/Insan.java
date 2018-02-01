package Default2_Class_Object;

public class Insan {
	
	private String isim;
	private int yas;
	
	/* cunstactor isimleri ayn� olmal�d�r
	 * ald�klar� parametreler ile farkl�la��rlar.
	*/
	
	public Insan() 
	{
		isim = "�simsiz";
		yas = 20;
	}
	public Insan(int alinanYas, String alinanIsim)
	{
		setYas(alinanYas);
		setIsim(alinanIsim);	
	}
	public void selamla()
	{
		System.out.println("Merhaba, benim ad�m "+isim);
	}
	
	public void setIsim(String isim)
	{
		this.isim = isim;
	}
	public String getIsim()
	{
		return isim;
	}
	
	public void setYas(int yas)
	{
		this.yas = yas;
	}
	public int getYas()
	{
		return yas;
	}
	

	public void biriniSelamla(Insan gelenInsan)
	{
		System.out.println("Merhaba " +gelenInsan.getIsim()+ ", benim ad�m "+isim+". Nas�ls�n?");
	}
	
	
	public void sayiSay(int baslangic, int son)
	{
		int sayi=baslangic;
		if(baslangic>son)
		{
			System.out.println("Ba�ang�� de�eri, biti� de�erinden b�y�k olamaz...");
			
		}
		else
		{
			while(sayi<=son)
			{
				System.out.println(sayi);
				sayi+=1;
			}
		}
	}
	
	
	
	
	
	//set ve get metodlar� ile i�erideki de�i�kenleri
	//de�i�tirmek ve onlara ula�may� sa�lamak i�in kullan�l�r.

}
