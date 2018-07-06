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
		
		System.out.println("�lk eleman = "+arrayListe.get(0));
		arrayListe.set(0, "R");
		System.out.println("�lk eleman de�i�tirildi = "+ arrayListe.get(0));
		System.out.println("Dizinin eleman say�s� = "+ arrayListe.size());
		
		System.out.println("\n");
		
		System.out.println("### D�Z�N�N ELEMANLARI ###");
		for(int i=0; i<arrayListe.size(); i++)
		{
			System.out.println(arrayListe.get(i));
		}
		
		System.out.println("\n");
		
		System.out.println("Birka� veri silindi!");
		arrayListe.remove("Java");
		//arrayListe.remove(2); �NDEX NUMARASI �LE S�LME YAPILAB�L�R.
		System.out.println("--------------------------");
		for(int x=0; x<arrayListe.size(); x++)
		{
			System.out.println(arrayListe.get(x));
		}
		
		System.out.println("\n");
		
		System.out.println("C# var m�? = "+arrayListe.indexOf("C#"));
		System.out.println("Pascal var m�? = "+arrayListe.indexOf("Pascal"));
		
		System.out.println("\n");
		
		arrayListe.set(3, "Pascal");
		
		System.out.println(arrayListe.indexOf("Pascal")); //3
		System.out.println(arrayListe.get(3)); // Pascal
		
		yazdir(arrayListe);
		
		//�ndexOf'larda sonu�, dizi eleman�n�n index numaras�n� d�nd�r�r.
		
		
		
		
		
		

	}

}
