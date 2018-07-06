import java.util.ArrayList;

public class Sarkicilar {
	
	private ArrayList<String> sarkici_listesi = new ArrayList<String>();
	
	public void sarkicilari_goster()
	{
		System.out.println("Þarkýcý listesinde "+sarkici_listesi.size() + " þarkýcý vardýr." );
		for(int i=0; i<sarkici_listesi.size(); i++)
		{
			System.out.println((i+1)+". þarkýcý : "+sarkici_listesi.get(i));
		}
	}
	
	public void sarkici_ekle(String isim)
	{
		sarkici_listesi.add(isim);
		System.out.println("Þarkýcý listeye eklendi!");
	}
	
	public void sarkici_guncelle(int pozisyon, String isim)
	{
		sarkici_listesi.set(pozisyon, isim);
		System.out.println("Þarkýcý listesi güncellendi!");
	}
	
	public void sarkici_sil(int pozisyon)
	{
		String isim = sarkici_listesi.get(pozisyon); //Þarkýcý ismini aldýk.
		sarkici_listesi.remove(pozisyon);
		System.out.println(isim+" isimli þarkýcý listeden silindi...");
	}
	
	public void sarkici_ara(String sarkici_ismi)
	{
		int pozisyon = sarkici_listesi.indexOf(sarkici_listesi);
		if(pozisyon>=0)  //Koþul saðlanýyorsa aranan þarkýcý listede var demektir.
		{
			System.out.println("Þarkýcý bulundu!");
			System.out.println(sarkici_ismi+" isimli þarkýcý "+(pozisyon+1)+". sýrada.");
		}
		else
		{
			System.out.println("Þarkýcý listede bulunamadý!");
		}
	}
	
	
	
	
}
