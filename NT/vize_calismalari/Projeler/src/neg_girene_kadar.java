import java.util.Scanner;
public class neg_girene_kadar {
	
	// kullanýcý negatif sayý girene kadar istediði kadar sayý gir 
		//bu girilen sayýlarý kendi oluþturduðumuz metoda çekeceðiz. içinden en büyük sayýyý ekrana yazýdýr.
		
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
			
			int[] sayi = new int [10000];
			
			int okunanSayi;
			int i = 0;
			
			Scanner girilen = new Scanner(System.in);
			
			while(true)
			{
				System.out.println("Sayý gir : ");
				okunanSayi = girilen.nextInt();
			
				if(okunanSayi<0)
				{
					break;
				}
				else
				{
					sayi[i] = okunanSayi;
					i++;
				}
			}
			
			System.out.println("Girilen en büyük sayý : "+getEnBuyukSayi(sayi));
			
			
			

		}

}
