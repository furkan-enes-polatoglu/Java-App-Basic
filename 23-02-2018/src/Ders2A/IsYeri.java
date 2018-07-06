package Ders2A;

class Calisan {
	  public String pozisyon="Calisan" ;
	  public void calis() {}
	}
	class Mudur extends Calisan {
	  public Mudur () { // yap�land�r�c�
	      pozisyon = "Mudur" ;
	  }
	  public void calis() { // iptal etme (override)
	      System.out.println("Mudur Calisiyor");
	  }
	}

	class Programci extends Calisan {
	  public Programci() { // yap�land�r�c�
	      pozisyon = "Programci" ;
	  }
	  public void calis() { // iptal etme (override)
	      System.out.println("Programci Calisiyor");
	  }
	}
	class Pazarlamaci extends Calisan {
	  public Pazarlamaci() { // yap�land�r�c�
	      pozisyon = "Pazarlamaci" ;
	  }
	  public void calis() { // iptal etme (override)
	      System.out.println("Pazarlamaci Calisiyor");
	  }
	}


	public class IsYeri {
		  public static void mesaiBasla(Calisan[] c ) {
		      for (int i = 0 ; i < c.length ; i++) {
		        c[i].calis(); // !Dikkat!
		      }
		  }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calisan[] c = new Calisan[4];
        c[0] = new Calisan(); // yukar� cevirim gerekmiyor
        c[1] = new Programci(); // yukar� cevirim (upcasting)
        c[2] = new Pazarlamaci(); // yukar� cevirim (upcasting)
        c[3] = new Mudur(); // yukar� cevirim (upcasting)
        mesaiBasla(c);

		}
	}
