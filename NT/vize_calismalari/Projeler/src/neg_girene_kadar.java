import java.util.Scanner;
public class neg_girene_kadar {
	
	// kullan�c� negatif say� girene kadar istedi�i kadar say� gir 
		//bu girilen say�lar� kendi olu�turdu�umuz metoda �ekece�iz. i�inden en b�y�k say�y� ekrana yaz�d�r.
		
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
				System.out.println("Say� gir : ");
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
			
			System.out.println("Girilen en b�y�k say� : "+getEnBuyukSayi(sayi));
			
			
			

		}

}
