package bossss;

public class MainClass {
	
	public static void main(String[] args) {
		
			BosClass n1 = new BosClass("Furkan",11316);
			BosClass n2 = new BosClass();
			
		//	n1.erisilemez="Eri�ildi";
		//	n1.serbest = 1;
			
		//	n2.erisilemez="A�a s�z�ld�!";
		//	n2.serbest=2;
			
			
			System.out.println(n1.getErisilemez());
			System.out.println(n1.serbest + "\n");
			
			System.out.println(n2.getErisilemez());
			System.out.println(n2.serbest + "\n");
			
			
			
			n1.setErisilemez("Eri�tik, Furkan de�il Enes"); //G�NCELL�YOR
			n1.serbest=123;									//G�NCELL�YOR
			
			
			System.out.println("De�i�iklik alg�nland�!!");
			System.out.println(n1.getErisilemez());
			System.out.println(n1.serbest+"\n");
			
			
		
			n1.setErisilemez("Eri�tik2, Enes de�il Ay�e");
			n1.serbest=14545;
			
			System.out.println("2. bir de�i�iklik alg�nland�!!");
			System.out.println(n1.getErisilemez());
			System.out.println(n1.serbest);
			
	
		
		}
	
	}


