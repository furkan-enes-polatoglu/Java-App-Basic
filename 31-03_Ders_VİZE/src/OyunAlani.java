
public class OyunAlani {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Oyuncu o = new Oyuncu("Bilgisayar Oyunu");
		Oyuncu o2 = new Oyuncu();
		
		o.isim = "Furkan";
		o.yas = 3;
		
		System.out.println("Oyunucunun Adý : "+o.isim);
		System.out.println("Oyuncunun Yaþý : "+o.yas);
		
		o.isimTemizle();
		o.yasSifirla();
		
		System.out.println("Oyunucunun Adý : "+o.isim);
		System.out.println("Oyuncunun Yaþý : "+o.yas);
		
		
		
		// private < protected < public - eriþilebilirlik sýrasý.
		
		
		

	}

}
