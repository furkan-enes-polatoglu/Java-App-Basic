package MetoduOverrideEtmek;

// Kediye �zg� �zellikler veriyoruz
// Hangi �zelli�ini vermek istersen sa� t�k > source > Override/Implement Methods se�ilir.

public class Kedi extends Hayvan {

	@Override
	// herhangi bir class'a ba�l� olmadan farkl� bi�imde �al��mas�n� sa�lar.
	
	public void sesCikar() {
		super.sesCikar();  // Hayvan Class'�n�n "sesCikar()" methodunu �a��rmam�za yar�yor.
		System.out.println("Miyav !, ben "+yas+" ya��nday�m.");
	}
	
	public void kediyeOzel() {  //bu methodu sadece kedi i�in kullanabiliriz.
		System.out.println("Kediye �zel...");
	}
	
}
