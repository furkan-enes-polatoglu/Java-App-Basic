import javax.xml.soap.SAAJResult;
import java.util.*;

public class DaireHesapla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner oku = new Scanner(System.in);
	hesaplaDaire islem = new hesaplaDaire();
	double k�sa;
	double uzun;
	
	System.out.println("K�sa kenar� giriniz : ");
	k�sa = oku.nextDouble();
	System.out.println("Uzun kenar� giriniz : ");
	uzun = oku.nextDouble();
	
	System.out.println("Dikd�rtgenin alan� = " + islem.alanHesapla(k�sa, uzun));
	
	}

}
