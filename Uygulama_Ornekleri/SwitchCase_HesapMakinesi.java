import javax.swing.JOptionPane;
public class SwitchCase_HesapMakinesi {

	public static void main(String[] args) {
		double sayi1;
		double sayi2;
		double sonuc=0;
		char operator;
		boolean durum=true;
		
		sayi1=Double.parseDouble(JOptionPane.showInputDialog("1.Say�y� giriniz : "));
		operator=JOptionPane.showInputDialog("��lemi giriniz : ").charAt(0);
		sayi2=Double.parseDouble(JOptionPane.showInputDialog("2.Say�y� giriniz : "));
		
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
			System.out.println("Hatal� ��lem!");
			
			if(durum==true)
				System.out.println("��lemin sonucu : "+sonuc);
				
		}
		
		
	}

}
