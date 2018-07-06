import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Ders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 List<String> liste1 = new ArrayList<String>();
	       
	        liste1.add("A");
	        liste1.add("B");
	        liste1.add("C");
	        liste1.set(0,"Z");
	        
	        List<String> liste2 = Arrays.asList("L","M","N");
	        liste1.addAll(2,liste2); //2.ÝNDEX'TEN ÝTÝBAREN EKLE
	        liste1.add(2,"D");
	        liste1.set(2,"G");
	        liste1.add(3,"E");
	       
		
		System.out.println(liste1);
		System.out.println(liste1.size()); //YAZDIRIRKEN 0'DAN BAÞLAMAZ.
		System.out.println("\n");
		
		
///////////////////////////////////////////////////////////////////////////////////////////////////////
		
		boolean b = liste1.contains("E");  //E HARFÝ LÝSTE1'DE VAR MI?
		System.out.println(b); //YUKARIDAKÝ SORGUNUN SONUCU TRUE-FALSE
		b = liste1.containsAll(Arrays.asList("A","B")); //LÝSTE1'DE HEM A HEMDE B VARMI?
		System.out.println(b); //YUKARIDAKÝ SORGUNUN SONUCU TRUE-FALSE 
		Object o = liste1.get(1); //LÝSTE1'ÝN 1. ÝNDEX'ÝNÝ O OBJESÝNE AT
		System.out.println(o); //ÜSTEKÝ SORGUYU YAZDIR.
		int i = liste1.indexOf("D"); //D HARFÝ LÝSTE1'ÝN KAÇINCI ÝNDEX'ÝNDE? YOKSA -1 YAZAR.
		System.out.println(i); //YUKARIDAKÝ DEÐÝÞKENÝN SONUCUNU YAZAR.
		System.out.println(liste1.isEmpty()); //LÝSTE1'Ý BOÞ OLARAK GÖSTERÝR. (FALSE)
		System.out.println("\n");
		
////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		//LÝSTE1 DÝZÝYE ÇEVRÝLMÝÞTÝR.
		
		String[] array = liste1.toArray(new String[] {});
		System.out.println(array[3]); //LÝSTE'NÝN (DÝZÝNÝN) 3. ÝNDEX'ÝNÝ YAZDIR.
		
		//YENÝ BÝR LÝSTESÝNÝN ÝÇÝNE LÝSTE1'Ý LÝNKED OLARAK ATAMIÞTIR.
		List<String> liste3 = new LinkedList<String>(liste1);
		System.out.println(liste3);
		System.out.println(liste1);
		liste1.remove(1);
		System.out.println(liste1);
		liste1.clear();
		System.out.println(liste1);
		
		
		

	}

}
