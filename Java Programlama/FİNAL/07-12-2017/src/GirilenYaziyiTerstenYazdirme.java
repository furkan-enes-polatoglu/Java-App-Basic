import java.util.Scanner;
public class GirilenYaziyiTerstenYazdirme {

	public static String tersCevir(String kelime)
	{
		int i;
		String sonuc = "";
		for(i=kelime.length()-1; i>=0; i--)
		{
			sonuc = sonuc + kelime.charAt(i);
		}
		return sonuc;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String kelime;
		Scanner oku = new Scanner(System.in);
		System.out.println("Kelime giriniz : ");
		kelime = oku.nextLine();
		System.out.println(tersCevir(kelime));

	}

}
