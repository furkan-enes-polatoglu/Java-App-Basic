import java.util.Scanner;
public class denemeeee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sayi, toplam=0;
		Scanner yaz = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Sayý giriniz : ");
			sayi = yaz.nextInt();
			
			toplam += sayi ;
			if(sayi>=100)
			{
				break;
			}
		}
		
		System.out.println(toplam);
		
		

	}

}
