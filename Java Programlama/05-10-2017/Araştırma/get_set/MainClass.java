package bossss;

public class MainClass {
	
	public static void main(String[] args) {
		
			BosClass n1 = new BosClass("Furkan",11316);
			BosClass n2 = new BosClass();
			
		//	n1.erisilemez="Eriþildi";
		//	n1.serbest = 1;
			
		//	n2.erisilemez="Aða sýzýldý!";
		//	n2.serbest=2;
			
			
			System.out.println(n1.getErisilemez());
			System.out.println(n1.serbest + "\n");
			
			System.out.println(n2.getErisilemez());
			System.out.println(n2.serbest + "\n");
			
			
			
			n1.setErisilemez("Eriþtik, Furkan deðil Enes"); //GÜNCELLÝYOR
			n1.serbest=123;									//GÜNCELLÝYOR
			
			
			System.out.println("Deðiþiklik algýnlandý!!");
			System.out.println(n1.getErisilemez());
			System.out.println(n1.serbest+"\n");
			
			
		
			n1.setErisilemez("Eriþtik2, Enes deðil Ayþe");
			n1.serbest=14545;
			
			System.out.println("2. bir deðiþiklik algýnlandý!!");
			System.out.println(n1.getErisilemez());
			System.out.println(n1.serbest);
			
	
		
		}
	
	}


