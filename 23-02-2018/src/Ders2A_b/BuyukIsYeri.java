package Ders2A_b;

	class Calisan {
		  public String pozisyon ;
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
		
		class GenelMudur extends Mudur {
		  public GenelMudur () { // yapýlandýrýcý
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
			  public Programci() { // yapýlandýrýcý
			      pozisyon = "Programci" ;
			  }
			  public void calis() { // iptal etme (override)
			      System.out.println("Programci Calisiyor");
			  }
			}
			class AnalizProgramci extends Programci {
			  public AnalizProgramci() { // yapýlandýrýcý
			      pozisyon = "AnalizProgramci" ;
			  }
			  public void analizYap() {
			      System.out.println("Analiz Yapiliyor");
			  } 
			}
			class SistemProgramci extends Programci {
			  public SistemProgramci() { // yapýlandýrýcý
			      pozisyon = "SistemProgramci" ;
			  }
			  public void sistemIncele() {
			      System.out.println("Sistem Inceleniyor");
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
				class Sekreter extends Calisan {
				  public Sekreter() { // yapýlandýrýcý
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
			   c[0]=new Calisan(); //yukarý cevirim gerekmiyor
			   c[1]=new Programci(); //yukarý cevirim (upcasting)
			   c[2]=new Pazarlamaci(); // yukarý cevirim (upcasting)
			   c[3]=new Mudur(); // yukarý cevirim (upcasting)
			   c[4]=new GenelMudur(); // yukarý cevirim (upcasting)
			   c[5]=new AnalizProgramci(); // yukarý cevirim (upcasting)
			   c[6]=new SistemProgramci(); // yukarý cevirim (upcasting)
			   mesaiBasla(c);


		
	}
}
