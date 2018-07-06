import java.util.ArrayList;

public class MainClass {
	
	public static void yazdir(ArrayList<String> a)
	{
		for(int i=0; i<a.size(); i++)
		{
			System.out.println("Element "+(i+1) + ":"+a.get(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arrayListe = new ArrayList<String>();
		
		arrayListe.add("Java");
		arrayListe.add("C#");
		arrayListe.add("C++");
		arrayListe.add("PHP");
		
		arrayListe.add(0,"Python");
		
		System.out.println("Ýlk eleman = "+arrayListe.get(0));
		arrayListe.set(0, "R");
		System.out.println("Ýlk eleman deðiþtirildi = "+ arrayListe.get(0));
		System.out.println("Dizinin eleman sayýsý = "+ arrayListe.size());
		
		System.out.println("\n");
		
		System.out.println("### DÝZÝNÝN ELEMANLARI ###");
		for(int i=0; i<arrayListe.size(); i++)
		{
			System.out.println(arrayListe.get(i));
		}
		
		System.out.println("\n");
		
		System.out.println("Birkaç veri silindi!");
		arrayListe.remove("Java");
		//arrayListe.remove(2); ÝNDEX NUMARASI ÝLE SÝLME YAPILABÝLÝR.
		System.out.println("--------------------------");
		for(int x=0; x<arrayListe.size(); x++)
		{
			System.out.println(arrayListe.get(x));
		}
		
		System.out.println("\n");
		
		System.out.println("C# var mý? = "+arrayListe.indexOf("C#"));
		System.out.println("Pascal var mý? = "+arrayListe.indexOf("Pascal"));
		
		System.out.println("\n");
		
		arrayListe.set(3, "Pascal");
		
		System.out.println(arrayListe.indexOf("Pascal")); //3
		System.out.println(arrayListe.get(3)); // Pascal
		
		yazdir(arrayListe);
		
		//ÝndexOf'larda sonuç, dizi elemanýnýn index numarasýný döndürür.
		
		
		
		
		
		

	}

}
