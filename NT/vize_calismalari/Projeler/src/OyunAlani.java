
public class OyunAlani {

	public static void main(String[] args) {
		
		
		Oyuncu o = new Oyuncu("Bilgisayar");
		Oyuncu o2 = new Oyuncu();
		
		
		o.isim= "furkan";
		o.yas = 3;
		o.yazi = "abc";
		
		System.out.println("Oyunucunun Adý : "+o.isim);
		System.out.println("Oyuncunun Yaþý : "+o.yas);
		System.out.println("Yazý : "+o.yazi);
		
		o.isimTemizle();
		o.yasSifirla();
		
		System.out.println("Oyunucunun Adý : "+o.isim);
		System.out.println("Oyuncunun Yaþý : "+o.yas);

	}

}
