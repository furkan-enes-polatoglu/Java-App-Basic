
public class Deneme_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=50;
		int b=70;
		int sonuc;

		boolean kontrol = false;
		sonuc=a+b/2;

		if (sonuc>=50) 
		{
			kontrol = true;
		}

		if(kontrol == true) 
		{
			System.out.println ("Öðrenci notu :"+sonuc+"\tDersi Geçti");
		}
		else 
		{
			System.out.println ("Öðrenci notu :"+sonuc);
		}
	}

}
