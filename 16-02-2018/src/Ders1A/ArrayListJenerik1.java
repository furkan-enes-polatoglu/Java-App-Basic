package Ders1A;

import java.util.ArrayList;

class SinifTipi{
	
	int id;
	String isim;
}

public class ArrayListJenerik1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		String s1 = "Bilgisayar Programcýlýðý";
		String s2 = "2.Sýnýf 1.Öðretim";
		a.add(s1);
		a.add(s2);
		
		ArrayList<SinifTipi> a2 = new ArrayList<SinifTipi>();
		SinifTipi st = new SinifTipi();
		st.id=100;
		st.isim="Furkan";
		a2.add(st); //tek satýrda arraylist verilerini ekledik.

	}

}
