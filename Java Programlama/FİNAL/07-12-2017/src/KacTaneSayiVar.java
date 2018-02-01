
public class KacTaneSayiVar {
	
	public static int rakamSay(String kelime)
	{
		int i;
		int sonuc=0;
		
		for(i=0; i<kelime.length(); i++)
		{
			if(Character.isDigit(kelime.charAt(i)))
			{
				sonuc++;
			}
		}
		return sonuc;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(rakamSay("f123urkan"));

	}

}
