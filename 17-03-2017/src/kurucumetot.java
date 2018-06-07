
public class kurucumetot {
	
	public kurucumetot() {
		
		System.out.println("Parametresiz kurucu metot çaðrýldý");
	}
	public kurucumetot(String a, int c){
		System.out.println("Bir parametreli kurucu metot : "+a+" , Sayýsý : "+c );
		
	}
	public kurucumetot(int a, int b){
		System.out.println("Ýki parametreli kurucu metot : "+ a*b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		kurucumetot nesne1 = new kurucumetot();
		kurucumetot nesne2 = new kurucumetot("Bilgisayar Programcýlýðý",5);
		kurucumetot nesne3 = new kurucumetot(5,6);

	}

}
