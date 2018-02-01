import java.util.Scanner;
public class Equals_IgnoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner scan = new Scanner(System.in);
		
		String yazi;
		System.out.print("Adýnýz : ");
		yazi = scan.nextLine();
		
		System.out.println("Merhaba "+yazi+", nasýlsýnýz?");
		
		//if(yazi.equals("Furkan"))
		
		//String isim = "Furkan";
		//if(yazi.equals(isim))
		
		//boolean kontrol = yazi.equals("Furkan");
		
		String isim = "Ali";
		boolean kontrol = yazi.equals(isim);
		
		if(kontrol) 
		{ 
			System.out.println("Baban nasýl?"); 
		}
		
	
		
		
		
		
	/*	Scanner scan = new Scanner(System.in);
		
		String yazi;
		System.out.println("Adýnýz : ");
		yazi = scan.nextLine();
		System.out.println("Merhaba "+yazi+", nasýlsýn?");
		
		if(yazi.equalsIgnoreCase("Ali")) 
		{ 
			System.out.println("Anan nasýl?"); 
		}
		
	*/

	}

}
