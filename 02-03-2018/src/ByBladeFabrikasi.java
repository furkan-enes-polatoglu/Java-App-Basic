
public class ByBladeFabrikasi {
	
	public ByBlade beybladeUret(String beyblade_turu)
	{
		if(beyblade_turu.equals("Dragon"))
		{
			return new Dragon("Mavi Ejderha", "Kutsal Canavarlarla Konu�ma", "Takao", 800,300);
		}
		else if(beyblade_turu.equals("Dranza"))
		{
			return new Dranza("K�rm�z� Anka Ku�u", "Kai", 600, 400);
		}
		else if(beyblade_turu.equals("Drayga"))
		{
			return new Drayga("Beyaz Kaplan", "Rai", 800, 250);
		}
		else if(beyblade_turu.equals("Draciel"))
		{
			return new Draciel("Kara Kaplumba�", "Max", 400, 1000);
		}
		else
			return null;
	}

}
