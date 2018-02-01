package Interface;  // INTERFACE'NIN ÝÇÝNDEKÝ BÜTÜN METODLAR ABSTRACT'TIR. VE ALT SINIFINDAKÝ CLASSLAR'DA BULUNMASI MECBURÝDÝR.
					// IMPLEMENTS BURADA KULLANILIR. CLASS'LARIN ÝÇÝNE ORTAK ABSTRACT METODLAR AKTARILMASINI SAÐLIYOR. 
					// BURAYA YAZILAN METODLARIN ÝÇÝNÝ BURADA DOLDURAMAZSIN. ABSTRACT OLDUÐU ÝÇÝN. BAÞKA CLASSLARDA DOLDURULUR.
 					// Bil interface'sini "implements" eden yani kullanan, içerisini dolduran classlarda doldurabiliriz.

public interface Bil {
	
	public void bilgisayardaYaz();
	
	public int bilgi(int a, int b);
	
	

}
