package Default2_Class_Object;

public class Bisiklet {	
	
	Insan binmisInsan;
	
	public Bisiklet()
	{
		binmisInsan = null;
	}
	
	public Bisiklet(Insan gelenInsan)
	{
		binmisInsan = gelenInsan;
	}
	
	public void bin(Insan gelenInsan)
	{
		if(binmisInsan == null) // bisiklet boþ ise
		{
			binmisInsan = gelenInsan;  // gelen insaný bisiklete bindir.
			System.out.println(binmisInsan.getIsim() + " baþarýyla bindi!");
		}
		
		else //binmiþ olan bir insan varsa
		{
			System.out.println("Zaten "+binmisInsan.getIsim()+" binmiþ!");
		}
	}

	public void in() {
		if(binmisInsan == null) // bisiklet boþ ise
		{
			System.out.println("Zaten bisiklet boþ!");
		}
		
		else //bisiklet boþ deðilse, indir..
		{
			String isim = binmisInsan.getIsim(); 
			/* önce isimi almalýyýz ki, binmis insaný null'a eþitledikten sonra 
		       binmiþ insanýn ismini yazabilelim.
		    */
			binmisInsan = null;
			System.out.println(isim+" indi!");
		}
		
	}
}
