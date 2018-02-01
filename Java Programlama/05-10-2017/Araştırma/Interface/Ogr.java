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
		System.out.println("Ad�m : " + isim);
	}
	
	public abstract void bolumSoyle();  // ABSTRACT METHOD G�ZEL PARANTEZ� YOK BO�TUR, EXTENDS OLAN CLASSLARA EKLEN�R.
										// D��ER CLASSLARA METOT BULUNDURMA �ARTI KOYAR. ZORUNLU HALE GEL�R.
	
	
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
