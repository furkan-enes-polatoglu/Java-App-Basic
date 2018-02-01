package MetoduOverrideEtmek;

// Kediye özgü özellikler veriyoruz
// Hangi özelliðini vermek istersen sað týk > source > Override/Implement Methods seçilir.

public class Kedi extends Hayvan {

	@Override
	// herhangi bir class'a baðlý olmadan farklý biçimde çalýþmasýný saðlar.
	
	public void sesCikar() {
		super.sesCikar();  // Hayvan Class'ýnýn "sesCikar()" methodunu çaðýrmamýza yarýyor.
		System.out.println("Miyav !, ben "+yas+" yaþýndayým.");
	}
	
	public void kediyeOzel() {  //bu methodu sadece kedi için kullanabiliriz.
		System.out.println("Kediye Özel...");
	}
	
}
