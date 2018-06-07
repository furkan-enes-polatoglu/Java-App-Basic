import javax.swing.JOptionPane;

public class for_while_do_while {

	public static void main(String[] args) {
		
		
		/* for(int i=1; i<=10; i++) 
		   {
			 if(i==5)
				 continue;
			System.out.println(i);
		   } */
		
		
		/* int sayac=1;
		while (sayac<=10)
		   {
			 if(sayac==5){
				 sayac++;
				 continue;
			 }
			System.out.println(sayac);
			sayac++;
		   }
	
		*/
		
	/*	int sayac=1;
		do {
				sayac++;
				System.out.println(sayac);
				
		   }
		while(sayac<=10);*/
	}
 
		
		/* int sayac=1;
		while(true) //sonsuz döngü
		{
			if (sayac==50)
			{
				break;
			}
			System.out.println(sayac);
			sayac++; */
			
		//}
		
		/*Kullanýcýdan bir sayý iste, 
		+ deðer girilen sayýlarý topla sayý negatif girilince programý durdur.*/
		
		
			 int adet=0;
			int toplam=0;
			int sayi=0; 
			
			{

				while(true)
				{
					sayi = Integer.parseInt(JOptionPane.showInputDialog("Bir sayi gir : "));
					if(sayi<0)
					{
						break;
					}
					System.out.print(sayi);
					
					toplam += sayi;
					
				}
			
					System.out.println(toplam);
			}
			}
	


