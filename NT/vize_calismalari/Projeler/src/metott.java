
public class metott {
	
	public metott()
	{
		System.out.println("Parametresiz");
	}
		
	
	public metott(String a, String b, int c)
	{
		System.out.println("��rencinin ad� : "+a+"\nSoyad� : "+b+"\nNumaras� : "+c);
	}

		
		public static void main(String[] args)
		{
			
			metott nesne1 = new metott();
			metott nesne2 = new metott("Furkan","Polato�lu",150);
			
		}
		
		

	}


