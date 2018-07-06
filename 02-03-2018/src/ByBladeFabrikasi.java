
public class ByBladeFabrikasi {
	
	public ByBlade beybladeUret(String beyblade_turu)
	{
		if(beyblade_turu.equals("Dragon"))
		{
			return new Dragon("Mavi Ejderha", "Kutsal Canavarlarla Konuþma", "Takao", 800,300);
		}
		else if(beyblade_turu.equals("Dranza"))
		{
			return new Dranza("Kýrmýzý Anka Kuþu", "Kai", 600, 400);
		}
		else if(beyblade_turu.equals("Drayga"))
		{
			return new Drayga("Beyaz Kaplan", "Rai", 800, 250);
		}
		else if(beyblade_turu.equals("Draciel"))
		{
			return new Draciel("Kara Kaplumbað", "Max", 400, 1000);
		}
		else
			return null;
	}

}
