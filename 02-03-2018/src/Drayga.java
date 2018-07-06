
public class Drayga extends ByBlade{
	
	private String kutsalCanavar;
	
	public Drayga(String kutsalCanavar, String beybladeci, int donusHizi, int saldiriGucu)
	{
		super(beybladeci, donusHizi, saldiriGucu);
		this.kutsalCanavar = kutsalCanavar;
	}
	
	@Override
	public void bilgileriGoster()
	{
		super.bilgileriGoster();
		System.out.println("Kutsal Canavar Ad�: "+kutsalCanavar);
	}
	
	@Override
	public void kutsalCanavariOrtayaCikar()
	{
		System.out.println(getBeybladeci()+" "+kutsalCanavar+"i ortaya ��kar�yor...");
		System.out.println(getBeybladeci()+" in sald�r�s�: Kaplan Pen�esi");
	}
}
