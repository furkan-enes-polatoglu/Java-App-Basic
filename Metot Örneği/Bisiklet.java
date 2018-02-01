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
		if(binmisInsan == null) // bisiklet bo� ise
		{
			binmisInsan = gelenInsan;  // gelen insan� bisiklete bindir.
			System.out.println(binmisInsan.getIsim() + " ba�ar�yla bindi!");
		}
		
		else //binmi� olan bir insan varsa
		{
			System.out.println("Zaten "+binmisInsan.getIsim()+" binmi�!");
		}
	}

	public void in() {
		if(binmisInsan == null) // bisiklet bo� ise
		{
			System.out.println("Zaten bisiklet bo�!");
		}
		
		else //bisiklet bo� de�ilse, indir..
		{
			String isim = binmisInsan.getIsim(); 
			/* �nce isimi almal�y�z ki, binmis insan� null'a e�itledikten sonra 
		       binmi� insan�n ismini yazabilelim.
		    */
			binmisInsan = null;
			System.out.println(isim+" indi!");
		}
		
	}
}
