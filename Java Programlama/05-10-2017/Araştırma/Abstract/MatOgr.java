package Abstract;

import Interface.Bil;

public class MatOgr extends Ogr implements Bil{

	public MatOgr(String isim, int no) {
		super(isim, no);
		// TODO Auto-generated constructor stub
		
		
	}
	public void hesapla()
	{
		System.out.println("Hesaplad�m!");
	}
	
	@Override
	public void bolumSoyle() {
		
		System.out.println("Benim b�l�m�m matematik!");
		
	}
	@Override
	public void bilgisayardaYaz() 
	{
		System.out.println("Yazd�m!");
			
	}
	@Override
	public int bilgi(int a, int b) {
		
		return a * b + b * 2;
	}
	
	
	@Override
	public void setIsim(String isim) {
		// TODO Auto-generated method stub
		super.setIsim(isim);
	}
	@Override
	public String ilSoyle() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	

}