package MetoduOverrideEtmek;

public class HayvanDene {

	public static void main(String[] args) {
		
		
		Kedi k = new Kedi();
		k.yas = 10;
		k.yasSoyle();
		k.yuru();
		k.sesCikar();
		
		
		System.out.print("\n");
		
		Köpek k1 = new Köpek();
		k1.yas = 15;
		k1.yasSoyle();
		k1.yuru();
		k1.sesCikar();
		

	}

}
