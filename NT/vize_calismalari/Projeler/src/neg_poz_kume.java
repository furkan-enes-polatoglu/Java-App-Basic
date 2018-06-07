import java.util.Scanner;
public class neg_poz_kume {

	public static void main(String[] args) {
		
		int [] A = new int[5];
		int [] neg = new int [5];
		int [] poz = new int [5];
		int n=0,p=0;
		
		Scanner cek = new Scanner(System.in);
		
		for(int i=0; i<5; i++)
		{
			System.out.println("Sayý gir : ");
			A[i] = cek.nextInt();
		}
			for(int i=0; i<5; i++)
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
			System.out.println("Pozitif sayýlar "+n+" tanedir.");
			System.out.println("Negatif sayýlar "+p+" tanedir.");

	}

}
