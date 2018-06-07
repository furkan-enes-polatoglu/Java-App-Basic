import java.util.Scanner;

public class hesap_makinesi {

	public static void main(String[] args) {
		
		Scanner cek = new Scanner(System.in);
		int islem;
		System.out.println("Yapmak istediðiniz iþlemi seçin ; ");
		System.out.println("Toplama:1 - Çýkarma:2 - Çarpma:3 - Bölme:4");
		islem = cek.nextInt();
	
		int a;
		System.out.print("1.Sayýyý giriniz : \n");
		a = cek.nextInt();
		
		int b;
		System.out.print("2.Sayýyý giriniz : ");
		b = cek.nextInt();
		
		
		if(islem==1) {
			System.out.println("Ýþlemin sonucu : "+ (a+b));
		}
		else if(islem==2) {
			System.out.println("Ýþlemin sonucu : "+ (a-b));
		}
		else if(islem==3) {
			System.out.println("Ýþlemin sonucu : "+ (a*b));
		}
		else if(islem==4){
			System.out.println("Ýþemin sonucu : " + (a/b));
		}
		else {
			System.out.println("Geçersiz iþlem!");
		}
			

	}

}
