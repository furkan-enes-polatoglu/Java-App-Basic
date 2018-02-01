package Default2_Class_Object;

public class Insan {
	
	private String isim;
	private int yas;
	
	/* cunstactor isimleri ayný olmalýdýr
	 * aldýklarý parametreler ile farklýlaþýrlar.
	*/
	
	public Insan() 
	{
		isim = "Ýsimsiz";
		yas = 20;
	}
	public Insan(int alinanYas, String alinanIsim)
	{
		setYas(alinanYas);
		setIsim(alinanIsim);	
	}
	public void selamla()
	{
		System.out.println("Merhaba, benim adým "+isim);
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
		System.out.println("Merhaba " +gelenInsan.getIsim()+ ", benim adým "+isim+". Nasýlsýn?");
	}
	
	
	public void sayiSay(int baslangic, int son)
	{
		int sayi=baslangic;
		if(baslangic>son)
		{
			System.out.println("Baþangýç deðeri, bitiþ deðerinden büyük olamaz...");
			
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
	
	
	
	
	
	//set ve get metodlarý ile içerideki deðiþkenleri
	//deðiþtirmek ve onlara ulaþmayý saðlamak için kullanýlýr.

}
