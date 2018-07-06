import java.util.LinkedList; //verileri tutar.
import java.util.ListIterator; //veriler aras�ndaki k�pr�y� sa�lar. Ba�ka t�rl� gezinde yap�lamaz.

public class Main {
	
	public static void listeyi_bastir(LinkedList<String> gidilecek_yerler)
	{
		ListIterator<String> iterator = gidilecek_yerler.listIterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
	
	public static void sirali_ekle(LinkedList<String> gidilecek_yerler, String yeni)
	{
		ListIterator <String> iterator = gidilecek_yerler.listIterator(); //Gezinme i�lemini sa�layan yap�d�r.
		
		while(iterator.hasNext()) // gidilecek_yerler listesinde bir yer var m�? varsa d�ns�n.
		{
			int karsilastir = iterator.next().compareTo(yeni);
			if(karsilastir==0) // daha �nce bu listeye eklenmi�tir.
			{
				System.out.println("Listenizde bu veri zaten var!");
				return;
			}
			else if(karsilastir>0)
			{
				iterator.previous();
				iterator.add(yeni);
				return; //metottan ��kmak i�indir. break sadece d�ng�den ��kaca�� i�in i�e yaramaz.
			}
		}
		iterator.add(yeni); //ya ilk eleman ya da listenin sonuna eklenecek olan iterat�r. En ba�ta liste null'dur ��nk�.
	}

	public static void main(String[] args) {
		
		LinkedList<String> gidilecek_yerler = new LinkedList<String>();
		
		sirali_ekle(gidilecek_yerler, "Postane");
		sirali_ekle(gidilecek_yerler, "Okul");
		sirali_ekle(gidilecek_yerler, "Market");
		sirali_ekle(gidilecek_yerler, "Furkan");
		sirali_ekle(gidilecek_yerler, "Zeynep");
		
		listeyi_bastir(gidilecek_yerler);

	}

}
