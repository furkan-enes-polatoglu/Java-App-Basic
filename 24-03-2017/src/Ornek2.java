import java.util.Scanner;
public class Ornek2 {
	
	public static void main(String[] args) {
		
		
		//kullanýcý dýþardan 10 tane tam sayý girsin. 
		//bunlarý a dizisine atasýn. a dizisindeki elemanlarý kontrol ederek
		//negatif olanlar negatif dizisine , pozitifler olanlar pozitif dizisine aktarýlsýn
		//ve negatif kaç tane pozitif kaç tane sonucu yaz
		
		int[] A = new int [10];
		int	[] neg = new int[10];
		int[] poz = new int[10];
		int n=0,p=0;
		
		Scanner sayi = new Scanner(System.in);
		//A dizisindeki elemanlarý giriyoruz
		
		for(int i=0; i<10; i++)
		{
			System.out.println("Sayý gir : ");
			A[i] = sayi.nextInt();	
		}
			for(int i=0; i<10; i++)
			{
				if(A[i]<0)
				{
					neg[n] = A[i];
					n++;
				}
				else if(A[i] > 0)
				{
					poz[p] = A[i];
					p++;
				}
				
				}
			System.out.println("Negatif Sayý : "+n+" tanedir.");
			System.out.println("Pozitif Sayý : "+p+" tanedir.");
		}
		
		
		

	}


