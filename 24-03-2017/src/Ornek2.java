import java.util.Scanner;
public class Ornek2 {
	
	public static void main(String[] args) {
		
		
		//kullan�c� d��ardan 10 tane tam say� girsin. 
		//bunlar� a dizisine atas�n. a dizisindeki elemanlar� kontrol ederek
		//negatif olanlar negatif dizisine , pozitifler olanlar pozitif dizisine aktar�ls�n
		//ve negatif ka� tane pozitif ka� tane sonucu yaz
		
		int[] A = new int [10];
		int	[] neg = new int[10];
		int[] poz = new int[10];
		int n=0,p=0;
		
		Scanner sayi = new Scanner(System.in);
		//A dizisindeki elemanlar� giriyoruz
		
		for(int i=0; i<10; i++)
		{
			System.out.println("Say� gir : ");
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
			System.out.println("Negatif Say� : "+n+" tanedir.");
			System.out.println("Pozitif Say� : "+p+" tanedir.");
		}
		
		
		

	}


