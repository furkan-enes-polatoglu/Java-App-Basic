import javax.swing.JOptionPane;

public class Odev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int gun=1;

		gun = JOptionPane.showInputDialog("Bugün haftanýn kaçýncý günü? : ").charAt(0);
		
		switch(gun) {
		case '1' :
			System.out.println("Pazartesi");
			break;
		case '2' :
			System.out.println("Salý");
			break;
		case '3' :
			System.out.println("Çarþamba");
			break;
		case '4' :
			System.out.println("Perþembe");
			break;
		case '5' :
			System.out.println("Cuma");
			break;
		case '6' :
			System.out.println("Bugün Cumartesi, haftasonunun keyfini çýkarýn..");
			break;
		case '7' :
			System.out.println("Bugün Pazar, tatilinizin keyfini çýkarýn..");
			break;
		default : 
			System.out.println("HATALI GÝRÝÞ YAPTINIZ!");
			

		
		
		
		
		
		}
	
		
		
		
	}

}
