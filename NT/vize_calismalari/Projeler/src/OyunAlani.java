
public class OyunAlani {

	public static void main(String[] args) {
		
		
		Oyuncu o = new Oyuncu("Bilgisayar");
		Oyuncu o2 = new Oyuncu();
		
		
		o.isim= "furkan";
		o.yas = 3;
		o.yazi = "abc";
		
		System.out.println("Oyunucunun Ad� : "+o.isim);
		System.out.println("Oyuncunun Ya�� : "+o.yas);
		System.out.println("Yaz� : "+o.yazi);
		
		o.isimTemizle();
		o.yasSifirla();
		
		System.out.println("Oyunucunun Ad� : "+o.isim);
		System.out.println("Oyuncunun Ya�� : "+o.yas);

	}

}
