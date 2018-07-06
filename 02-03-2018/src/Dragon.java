
public class Dragon extends ByBlade {
	
private String kutsalCanavar;
private String gizliYetenek;
	
	public Dragon(String kutsalCanavar, String gizliYetenek, String beybladeci, int donusHizi, int saldiriGucu)
	{
		super(beybladeci, donusHizi, saldiriGucu);
		this.kutsalCanavar = kutsalCanavar;
	}
	
	@Override
	public void bilgileriGoster()
	{
		super.bilgileriGoster();
		System.out.println("Kutsal Canavar Ad�: "+kutsalCanavar);
		System.out.println("Gizli Yetenek: "+gizliYetenek);
	}
	
	@Override
	public void kutsalCanavariOrtayaCikar()
	{
		System.out.println(getBeybladeci()+" "+kutsalCanavar+" ortaya ��kar�yor...");
		System.out.println(getBeybladeci()+" in sald�r�s�: Hayalet Kas�rgas�\n");
	}
}
