import javax.swing.JOptionPane;
public class SwitchCase_HesapMakinesi {

	public static void main(String[] args) {
		double sayi1;
		double sayi2;
		double sonuc=0;
		char operator;
		boolean durum=true;
		
		sayi1=Double.parseDouble(JOptionPane.showInputDialog("1.Sayýyý giriniz : "));
		operator=JOptionPane.showInputDialog("Ýþlemi giriniz : ").charAt(0);
		sayi2=Double.parseDouble(JOptionPane.showInputDialog("2.Sayýyý giriniz : "));
		
		switch(operator) {
		case'*':
			sonuc = sayi1*sayi2;
			break;
		case'/':
			sonuc = sayi1/sayi2;
			break;
		case'+':
			sonuc = sayi1+sayi2;
			break;
		case'-':
			sonuc = sayi1-sayi2;
			break;	
		default:
			durum=false;
			System.out.println("Hatalý Ýþlem!");
			
			if(durum==true)
				System.out.println("Ýþlemin sonucu : "+sonuc);
				
		}
		
		
	}

}
