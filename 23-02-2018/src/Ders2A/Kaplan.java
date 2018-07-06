package Ders2A;

class Kedi {
	
	public void yakalaAv() 
		{
        	System.out.println("Kedi sinifi Av yakaladi");
		}
	}

class Kaplan extends Kedi {
	
	public static void goster(Kedi k) 
	{
		k.yakalaAv(); 
	}
  
  public void yakalaAv() 
  {
        System.out.println("Kaplan sinifi Av yakaladi");
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Kedi k = new Kedi() ;
        Kaplan kp = new Kaplan();
        goster(k); 
        goster(kp); // yukari dogru cevirim (upcasting)       
	
	}
}

/*Final olarak tanýmlanmýþ bir metodu bir kez daha ayný isimle kullanamazsýn.*/


