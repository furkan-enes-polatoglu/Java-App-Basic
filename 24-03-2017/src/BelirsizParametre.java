
public class BelirsizParametre {
	
	static int getEnBuyukSayi (int... dizi)
	{
		int enb = 0;
			for(int sayi : dizi)
			{
				if(sayi>enb)
					enb=sayi;
			}
		
		return enb;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(getEnBuyukSayi(26,35,87,9,1,0,45,67,152,-54,21));
		
		
		
		

	}

}
