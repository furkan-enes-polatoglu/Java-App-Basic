import javax.swing.JOptionPane;

public class Odev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int gun=1;

		gun = JOptionPane.showInputDialog("Bug�n haftan�n ka��nc� g�n�? : ").charAt(0);
		
		switch(gun) {
		case '1' :
			System.out.println("Pazartesi");
			break;
		case '2' :
			System.out.println("Sal�");
			break;
		case '3' :
			System.out.println("�ar�amba");
			break;
		case '4' :
			System.out.println("Per�embe");
			break;
		case '5' :
			System.out.println("Cuma");
			break;
		case '6' :
			System.out.println("Bug�n Cumartesi, haftasonunun keyfini ��kar�n..");
			break;
		case '7' :
			System.out.println("Bug�n Pazar, tatilinizin keyfini ��kar�n..");
			break;
		default : 
			System.out.println("HATALI G�R�� YAPTINIZ!");
			

		
		
		
		
		
		}
	
		
		
		
	}

}
