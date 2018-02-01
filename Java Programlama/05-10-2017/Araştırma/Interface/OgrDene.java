package Abstract;


public class OgrDene {

	public static void main(String[] args) {
		
		Ogr o1 = new FenOgr("Ali",2);
		Ogr o2 = new MatOgr("Furkan",5);
		Ogr o3 = new PsiOgr("Emrah",7);
		
		o1.adSoyle();
		o2.adSoyle();
		o3.adSoyle();

		o1.bolumSoyle();
		o2.bolumSoyle();
		o3.bolumSoyle();
		
		((FenOgr) o1).bil();	  //ona �zg� bir metot olu�turulursa yaz�l�r.
		((MatOgr) o2).hesapla();  //ona �zg� bir metot olu�turulursa yaz�l�r.
		
		((MatOgr) o2).bilgisayardaYaz();
		((FenOgr) o1).bilgisayardaYaz();
		
		((PsiOgr) o3).ciz();
		((FenOgr) o1).ciz();
		
		o2.babaAdi();
		
		
		
		

		
	}

}
