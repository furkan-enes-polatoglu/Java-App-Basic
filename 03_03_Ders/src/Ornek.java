import javax.swing.JOptionPane;
public class Ornek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ay=1;
		
		ay = JOptionPane.showInputDialog("Ka��nc� ayday�z?").charAt(0);
		
		switch(ay) {
		case '1' :
			System.out.println("Ocak");
			break;
		case '2' :
			System.out.println("�ubat");
			break;
		case '3' :
			System.out.println("Mart");
			break;
		case '4' :
			System.out.println("Nisan");
			break;
		case '5' :
			System.out.println("May�s");
			break;
		case '6' :
			System.out.println("Haziran");
			break;
		case '7' :
			System.out.println("Temmuz");
			break;
		case '8' :
			System.out.println("A�uztos");
			break;
		case '9' :
			System.out.println("Eyl�l");
			break;
	
	
			default :
				System.out.println("HATALI DE�ER G�RD�N�Z!");
	
		}
		

	}

}
