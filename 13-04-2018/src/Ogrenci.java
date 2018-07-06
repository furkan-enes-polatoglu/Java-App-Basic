
public class Ogrenci {
	
	private String isim;
	
	public Ogrenci(String isim)  //Kurucu metot sýnýf ismi ile ayný olmak zorundadýr.
	{
		this.setIsim(isim);
	}

	public String getIsim() {
		return isim;
	}
	
	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	@Override
	public String toString(){
		return "Ýsim : "+isim;
	}


	

}
