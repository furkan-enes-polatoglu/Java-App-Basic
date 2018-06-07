import javax.swing.JOptionPane;

public class SwichHesapMak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double sayi1;
		double sayi2;
		char operator;
		double sonuc=0;
		boolean durum  = true;
		
		sayi1 = Double.parseDouble(JOptionPane.showInputDialog("1.Sayýyý giriniz : "));
		operator = JOptionPane.showInputDialog("Ýþlemi giriniz : ").charAt(0);
		sayi2 = Double.parseDouble(JOptionPane.showInputDialog("2.Sayýyý giriniz : "));
		
		switch(operator) {
			case '*' :
				sonuc = sayi1 * sayi2;
				break;
			case '/' :
				sonuc = sayi1 / sayi2;
				break;
			case '+' :
				sonuc = sayi1 + sayi2;
				break;
			case '-' :
				sonuc = sayi1 - sayi2;
				break;
			default :
				durum = false;
				System.out.println("HATALI ÝÞLEM!");
				
		}
			if (durum==true)
			System.out.println("Ýþlemin sonucu = "+sonuc);
		
	    }
}
	
	
