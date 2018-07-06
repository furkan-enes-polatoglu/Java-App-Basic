package Ders2A_b;

	class Calisan {
		  public String pozisyon ;
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
		
		class GenelMudur extends Mudur {
		  public GenelMudur () { // yap�land�r�c�
		     pozisyon = "GenelMudur" ;
		  }
		  public void calis() { // iptal etme (override)
		      System.out.println("GenelMudur Calisiyor");
		  }
		  public void toplantiYonet() { 
		      System.out.println("GenelMudur toplanti yonetiyor");
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
			class AnalizProgramci extends Programci {
			  public AnalizProgramci() { // yap�land�r�c�
			      pozisyon = "AnalizProgramci" ;
			  }
			  public void analizYap() {
			      System.out.println("Analiz Yapiliyor");
			  } 
			}
			class SistemProgramci extends Programci {
			  public SistemProgramci() { // yap�land�r�c�
			      pozisyon = "SistemProgramci" ;
			  }
			  public void sistemIncele() {
			      System.out.println("Sistem Inceleniyor");
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
				class Sekreter extends Calisan {
				  public Sekreter() { // yap�land�r�c�
				      pozisyon = "Sekreter" ;
				  }
				  public void calis() { // iptal etme (override)
				      System.out.println("Sekreter Calisiyor");
				 }
				}

	public class BuyukIsYeri {
		
		  public static void mesaiBasla(Calisan[] c ) {
		      for (int i = 0 ; i < c.length ; i++) {
		        c[i].calis(); // ! Dikkat !
		      }

		  }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Calisan[] c = new Calisan[7];
			   c[0]=new Calisan(); //yukar� cevirim gerekmiyor
			   c[1]=new Programci(); //yukar� cevirim (upcasting)
			   c[2]=new Pazarlamaci(); // yukar� cevirim (upcasting)
			   c[3]=new Mudur(); // yukar� cevirim (upcasting)
			   c[4]=new GenelMudur(); // yukar� cevirim (upcasting)
			   c[5]=new AnalizProgramci(); // yukar� cevirim (upcasting)
			   c[6]=new SistemProgramci(); // yukar� cevirim (upcasting)
			   mesaiBasla(c);


		
	}
}
