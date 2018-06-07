import javax.swing.JOptionPane;
public class Ornek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ay=1;
		
		ay = JOptionPane.showInputDialog("Kaçýncý aydayýz?").charAt(0);
		
		switch(ay) {
		case '1' :
			System.out.println("Ocak");
			break;
		case '2' :
			System.out.println("Þubat");
			break;
		case '3' :
			System.out.println("Mart");
			break;
		case '4' :
			System.out.println("Nisan");
			break;
		case '5' :
			System.out.println("Mayýs");
			break;
		case '6' :
			System.out.println("Haziran");
			break;
		case '7' :
			System.out.println("Temmuz");
			break;
		case '8' :
			System.out.println("Aðuztos");
			break;
		case '9' :
			System.out.println("Eylül");
			break;
	
	
			default :
				System.out.println("HATALI DEÐER GÝRDÝNÝZ!");
	
		}
		

	}

}
