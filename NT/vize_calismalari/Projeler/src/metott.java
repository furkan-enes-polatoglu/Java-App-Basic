
public class metott {
	
	public metott()
	{
		System.out.println("Parametresiz");
	}
		
	
	public metott(String a, String b, int c)
	{
		System.out.println("Öðrencinin adý : "+a+"\nSoyadý : "+b+"\nNumarasý : "+c);
	}

		
		public static void main(String[] args)
		{
			
			metott nesne1 = new metott();
			metott nesne2 = new metott("Furkan","Polatoðlu",150);
			
		}
		
		

	}


