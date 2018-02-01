package Abstract;

import Interface.Ciz;

public class PsiOgr extends Ogr implements Ciz {

	public PsiOgr(String isim, int no) {
		super(isim, no);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bolumSoyle() {
		
		System.out.println("Benim bölümüm psi!");

	}

	@Override
	public void ciz() {
		System.out.println("Çizelim aðabey!");
		
	}

	@Override
	public String ilSoyle() {
		// TODO Auto-generated method stub
		return "Ýst";
	}

}
