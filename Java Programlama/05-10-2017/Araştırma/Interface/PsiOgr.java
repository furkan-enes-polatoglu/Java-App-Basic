package Abstract;

import Interface.Ciz;

public class PsiOgr extends Ogr implements Ciz {

	public PsiOgr(String isim, int no) {
		super(isim, no);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bolumSoyle() {
		
		System.out.println("Benim b�l�m�m psi!");

	}

	@Override
	public void ciz() {
		System.out.println("�izelim a�abey!");
		
	}

	@Override
	public String ilSoyle() {
		// TODO Auto-generated method stub
		return "�st";
	}

}
