import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	
	public static void islemleri_bastir() 
	{
		System.out.println("0 - Ýþlemleri görüntüle");
		System.out.println("1 - Bir sonraki þehre git");
		System.out.println("2 - Bir önceki þehre git");
		System.out.println("3 - Uygulamadan çýk");
	}
	
	public static void sehirleri_turla(LinkedList<String> sehirler) 
	{
		ListIterator<String> iterator = sehirler.listIterator();
		int islem;
		
		islemleri_bastir();
		Scanner scanner = new Scanner(System.in);
		
		if(!iterator.hasNext()) //listede deðer yoksa
		{
			System.out.println("Herhangi bir þehir bulunmuyor!");
		}
		
		boolean cikis = false;
		boolean ileri = true;
		while(!cikis) //çýkýþ true olana kadar dön.
		{
			System.out.println("Bir iþlem seçiniz : ");
			islem = scanner.nextInt();
			
			switch(islem)
			{
				case 0: 
					islemleri_bastir(); break;
				case 1:
					if(!ileri)
					{
						if(iterator.hasNext()) { iterator.next(); }
						ileri = true;
					}
					if(iterator.hasNext()) { System.out.println("Þehre gidiliyor : "+iterator.next()); }
					else { System.out.println("Gidilecek herhangi bir þehir bulunamadý!"); }
					break;
				case 2:
					if(ileri)
					{
						if(iterator.hasPrevious()) { iterator.previous(); }
						ileri = false;
					}	
					if(iterator.hasPrevious()) { System.out.println("Þehre gidiliyor : "+iterator.previous()); }
					else { System.out.println("Baþladýðýn þehirdesin..."); }
					break;
				case 3:
					cikis = true;
					System.out.println("Uygulamadan çýkýlýyor...");
					break;
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> sehirler = new LinkedList<String>();
		
		sehirler.add("Bursa");
		sehirler.add("Ýstanbul");
		sehirler.add("Ýzmir");
		sehirler.add("Ankara");
		sehirler.add("Kütahya");
		
		sehirleri_turla(sehirler);

	}

}
