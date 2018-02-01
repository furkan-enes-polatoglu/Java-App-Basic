package Abstract;

import Interface.Bil;
import Interface.Ciz;

public class FenOgr extends Ogr implements Bil, Ciz {

	public FenOgr(String isim, int no) {
		super(isim, no);
		// TODO Auto-generated constructor stub
	}
	public void bil()
	{
		System.out.println("Bildim!");
	}
	@Override
	public void bolumSoyle() {
		System.out.println("Benim b�l�m�m fen!");
		
		
	}
	@Override
	public void bilgisayardaYaz() {
		
		System.out.println("Tamam, tamam, yazd�m..");
		
	}
	@Override
	public int bilgi(int a, int b) {
		// TODO Auto-generated method stub
		return a * b * b;
	}
	@Override
	public void ciz() {
		System.out.println("Tamam, tamam, �izdim....");
		
	}
	@Override
	public String ilSoyle() {
		// TODO Auto-generated method stub
		return "Bursa";
	}

}
