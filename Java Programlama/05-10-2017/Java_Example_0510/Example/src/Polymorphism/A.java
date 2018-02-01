package Polymorphism;

public class A {
	
	private String ad;
	private String soyad;
	private int yas;
	
	public A()
	{
		System.out.println("A");
	}
	public A(String ad)
	{
		System.out.println("+A+");
	}
	////////////////////////////////////////////
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	///////////////////////////////////////////
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	///////////////////////////////////////////
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	

}
