package Polymorphism;

public class Poly {
	
	public void CokBicimlilik(A polymorphism)
	{
		// InstanceOf, �ok bi�imlili�in anahtar kelimesidir.
		
		if(polymorphism instanceof A)  // A nesnesi, A'dan extends alm�� m�? A'ya benziyor mu? A'n�n t�revi mi?
		{
			System.out.println("JAVA1");	
		}
		if(polymorphism instanceof B)
		{
			System.out.println("JAVA2");
		}
		if(polymorphism instanceof C)
		{
			System.out.println("JAVA2");
		}
	}

	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		C c = new C();
		
//		Poly p = new Poly();  
//		p.CokBicimlilik(a);     //CokBicimlilik metoduna "a" nesnesi g�nderdik.
//		p.CokBicimlilik(b);
//		p.CokBicimlilik(c);
	}

}
