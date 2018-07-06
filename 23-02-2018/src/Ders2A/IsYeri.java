package Ders2A;

class Calisan {
	  public String pozisyon="Calisan" ;
	  public void calis() {}
	}
	class Mudur extends Calisan {
	  public Mudur () { // yapýlandýrýcý
	      pozisyon = "Mudur" ;
	  }
	  public void calis() { // iptal etme (override)
	      System.out.println("Mudur Calisiyor");
	  }
	}

	class Programci extends Calisan {
	  public Programci() { // yapýlandýrýcý
	      pozisyon = "Programci" ;
	  }
	  public void calis() { // iptal etme (override)
	      System.out.println("Programci Calisiyor");
	  }
	}
	class Pazarlamaci extends Calisan {
	  public Pazarlamaci() { // yapýlandýrýcý
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
        c[0] = new Calisan(); // yukarý cevirim gerekmiyor
        c[1] = new Programci(); // yukarý cevirim (upcasting)
        c[2] = new Pazarlamaci(); // yukarý cevirim (upcasting)
        c[3] = new Mudur(); // yukarý cevirim (upcasting)
        mesaiBasla(c);

		}
	}
