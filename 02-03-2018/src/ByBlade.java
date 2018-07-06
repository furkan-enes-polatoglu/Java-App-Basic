
public class ByBlade {
	
	private String beybladeci;
	private int donusHizi;
	private int saldiriGucu;
	
	public ByBlade(String beybladeci, int donusHizi, int saldiriGucu)  //Kurucu metodun ismi class ismi ile ayn� olmak zorundad�r.
	{
		this.setBeybladeci(beybladeci);
		this.setDonusHizi(donusHizi);
		this.setSaldiriGucu(saldiriGucu);
	}

	public String getBeybladeci() {
		return beybladeci;
	}

	public void setBeybladeci(String beybladeci) {
		this.beybladeci = beybladeci;
	}

	public int getDonusHizi() {
		return donusHizi;
	}

	public void setDonusHizi(int donusHizi) {
		this.donusHizi = donusHizi;
	}

	public int getSaldiriGucu() {
		return saldiriGucu;
	}

	public void setSaldiriGucu(int saldiriGucu) {
		this.saldiriGucu = saldiriGucu;
	}
	
	public void saldir()
	{
		System.out.println(beybladeci+" "+saldiriGucu+" ve "+""+donusHizi+" ile sald�r�yor...");
	}
	
	public void kutsalCanavariOrtayaCikar()
	{
		System.out.println("Bu byblade'nin kutsal canavar� bulunmuyor...");
	}
	
	public void bilgileriGoster()
	{
		System.out.println("ByBlade'ci ismi: "+beybladeci);
		System.out.println("Sald�r� g�c�: "+saldiriGucu);
		System.out.println("D�n�� h�z�: "+donusHizi);
	}
}
