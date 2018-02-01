package Abstract;

public abstract class Ogr {
	
	private String isim;
	private int no;
	
	public Ogr(String isim, int no) {
		this.isim = isim;
		this.no = no;
		
		
	}
	public void adSoyle()
	{
		System.out.println("Adým : " + isim);
	}
	
	public abstract void bolumSoyle();  // ABSTRACT METHOD GÜZEL PARANTEZÝ YOK BOÞTUR, EXTENDS OLAN CLASSLARA EKLENÝR.
										// DÝÐER CLASSLARA METOT BULUNDURMA ÞARTI KOYAR. ZORUNLU HALE GELÝR.
	
	
	public abstract String ilSoyle();
	
	
	public String babaAdi() {
		return "Furkan";
	}
	
	
	
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = ("Emrah");
	}
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	

}
