
public class Ogrenci {
	
	private String isim;
	
	public Ogrenci(String isim)  //Kurucu metot s�n�f ismi ile ayn� olmak zorundad�r.
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
		return "�sim : "+isim;
	}


	

}
