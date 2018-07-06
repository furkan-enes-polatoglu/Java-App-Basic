
public class Dranza extends ByBlade{
	
	private String kutsalCanavar;
	
	public Dranza(String kutsalCanavar, String beybladeci, int donusHizi, int saldiriGucu)
	{
		super(beybladeci, donusHizi, saldiriGucu);
		this.kutsalCanavar = kutsalCanavar;
	}
	
	@Override
	public void bilgileriGoster()
	{
		super.bilgileriGoster();
		System.out.println("Kutsal Canavar Adý: "+kutsalCanavar);
	}
	
	@Override
	public void kutsalCanavariOrtayaCikar()
	{
		System.out.println(getBeybladeci()+" "+kutsalCanavar+"i ortaya çýkarýyor...");
		System.out.println(getBeybladeci()+" in saldýrýsý: Alev Kýlýcý");
	}
}
