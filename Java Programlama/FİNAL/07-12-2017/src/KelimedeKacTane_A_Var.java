
public class KelimedeKacTane_A_Var {
	
	public static int aSay(String kelime)
	{
		int i;
		char harf = 'a';
		int adet = 0;
		for(i=0; i<kelime.length(); i++)
		{
			if(kelime.charAt(i)==harf)
			{
				adet = adet + 1;
			}
		}
		return adet;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(aSay("furkan"));


	}

}
