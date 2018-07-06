import java.util.LinkedList; //verileri tutar.
import java.util.ListIterator; //veriler arasýndaki köprüyü saðlar. Baþka türlü gezinde yapýlamaz.

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
		ListIterator <String> iterator = gidilecek_yerler.listIterator(); //Gezinme iþlemini saðlayan yapýdýr.
		
		while(iterator.hasNext()) // gidilecek_yerler listesinde bir yer var mý? varsa dönsün.
		{
			int karsilastir = iterator.next().compareTo(yeni);
			if(karsilastir==0) // daha önce bu listeye eklenmiþtir.
			{
				System.out.println("Listenizde bu veri zaten var!");
				return;
			}
			else if(karsilastir>0)
			{
				iterator.previous();
				iterator.add(yeni);
				return; //metottan çýkmak içindir. break sadece döngüden çýkacaðý için iþe yaramaz.
			}
		}
		iterator.add(yeni); //ya ilk eleman ya da listenin sonuna eklenecek olan iteratör. En baþta liste null'dur çünkü.
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
