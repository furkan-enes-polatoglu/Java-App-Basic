import java.util.Scanner;

public class hesap_makinesi {

	public static void main(String[] args) {
		
		Scanner cek = new Scanner(System.in);
		int islem;
		System.out.println("Yapmak istedi�iniz i�lemi se�in ; ");
		System.out.println("Toplama:1 - ��karma:2 - �arpma:3 - B�lme:4");
		islem = cek.nextInt();
	
		int a;
		System.out.print("1.Say�y� giriniz : \n");
		a = cek.nextInt();
		
		int b;
		System.out.print("2.Say�y� giriniz : ");
		b = cek.nextInt();
		
		
		if(islem==1) {
			System.out.println("��lemin sonucu : "+ (a+b));
		}
		else if(islem==2) {
			System.out.println("��lemin sonucu : "+ (a-b));
		}
		else if(islem==3) {
			System.out.println("��lemin sonucu : "+ (a*b));
		}
		else if(islem==4){
			System.out.println("��emin sonucu : " + (a/b));
		}
		else {
			System.out.println("Ge�ersiz i�lem!");
		}
			

	}

}
