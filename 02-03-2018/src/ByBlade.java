
public class ByBlade {
	
	private String beybladeci;
	private int donusHizi;
	private int saldiriGucu;
	
	public ByBlade(String beybladeci, int donusHizi, int saldiriGucu)  //Kurucu metodun ismi class ismi ile ayný olmak zorundadýr.
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
		System.out.println(beybladeci+" "+saldiriGucu+" ve "+""+donusHizi+" ile saldýrýyor...");
	}
	
	public void kutsalCanavariOrtayaCikar()
	{
		System.out.println("Bu byblade'nin kutsal canavarý bulunmuyor...");
	}
	
	public void bilgileriGoster()
	{
		System.out.println("ByBlade'ci ismi: "+beybladeci);
		System.out.println("Saldýrý gücü: "+saldiriGucu);
		System.out.println("Dönüþ hýzý: "+donusHizi);
	}
}
