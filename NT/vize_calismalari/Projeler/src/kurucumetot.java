
public class kurucumetot {
	
	public static int yas=20;

	
private kurucumetot() {
		
		System.out.println("Parametresiz kurucu metot çaðrýldý");
	}
	public kurucumetot(String a, int c){
		System.out.println("Bir parametreli kurucu metot : "+a+" , Sayýsý : "+c );
		
	}
	public kurucumetot(int a, int b){
		System.out.println("Ýki parametreli kurucu metot çarpýmý : "+ a*b);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		yas = 30;
		
		System.out.println(yas);
		
		kurucumetot nesne1 = new kurucumetot();
		kurucumetot nesne2 = new kurucumetot("Evet",1);
		kurucumetot nesne3 = new kurucumetot(5,2);
		

	}

}
