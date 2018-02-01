import javax.xml.soap.SAAJResult;
import java.util.*;

public class DaireHesapla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner oku = new Scanner(System.in);
	hesaplaDaire islem = new hesaplaDaire();
	double kýsa;
	double uzun;
	
	System.out.println("Kýsa kenarý giriniz : ");
	kýsa = oku.nextDouble();
	System.out.println("Uzun kenarý giriniz : ");
	uzun = oku.nextDouble();
	
	System.out.println("Dikdörtgenin alaný = " + islem.alanHesapla(kýsa, uzun));
	
	}

}
