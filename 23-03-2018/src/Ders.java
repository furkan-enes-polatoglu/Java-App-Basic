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
	        liste1.addAll(2,liste2); //2.�NDEX'TEN �T�BAREN EKLE
	        liste1.add(2,"D");
	        liste1.set(2,"G");
	        liste1.add(3,"E");
	       
		
		System.out.println(liste1);
		System.out.println(liste1.size()); //YAZDIRIRKEN 0'DAN BA�LAMAZ.
		System.out.println("\n");
		
		
///////////////////////////////////////////////////////////////////////////////////////////////////////
		
		boolean b = liste1.contains("E");  //E HARF� L�STE1'DE VAR MI?
		System.out.println(b); //YUKARIDAK� SORGUNUN SONUCU TRUE-FALSE
		b = liste1.containsAll(Arrays.asList("A","B")); //L�STE1'DE HEM A HEMDE B VARMI?
		System.out.println(b); //YUKARIDAK� SORGUNUN SONUCU TRUE-FALSE 
		Object o = liste1.get(1); //L�STE1'�N 1. �NDEX'�N� O OBJES�NE AT
		System.out.println(o); //�STEK� SORGUYU YAZDIR.
		int i = liste1.indexOf("D"); //D HARF� L�STE1'�N KA�INCI �NDEX'�NDE? YOKSA -1 YAZAR.
		System.out.println(i); //YUKARIDAK� DE���KEN�N SONUCUNU YAZAR.
		System.out.println(liste1.isEmpty()); //L�STE1'� BO� OLARAK G�STER�R. (FALSE)
		System.out.println("\n");
		
////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		//L�STE1 D�Z�YE �EVR�LM��T�R.
		
		String[] array = liste1.toArray(new String[] {});
		System.out.println(array[3]); //L�STE'N�N (D�Z�N�N) 3. �NDEX'�N� YAZDIR.
		
		//YEN� B�R L�STES�N�N ���NE L�STE1'� L�NKED OLARAK ATAMI�TIR.
		List<String> liste3 = new LinkedList<String>(liste1);
		System.out.println(liste3);
		System.out.println(liste1);
		liste1.remove(1);
		System.out.println(liste1);
		liste1.clear();
		System.out.println(liste1);
		
		
		

	}

}
