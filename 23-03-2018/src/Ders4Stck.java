import java.util.Stack;
public class Ders4Stck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//SON G�REN �LK �IKAR (�UVAL)
		
		//peek g�r�r
		//push ekler
		//pop ��kart�r
	        
	        
	        Stack<String> stack = new Stack<String>();
	        stack.push("Arslan");
	        stack.push("Tilki");
	        stack.push("Kedi");       
	        stack.pop();
	        stack.push("Kurba�a");
	        
	        //Arslan Tilki Kurba�a
	        
	        String s1 = stack.peek(); //Kurba�a'y� g�r�r. s1 : Kurba�a
	        String s2 = stack.pop();  //Ve Kurba�a'y� siler. s2=Kurba�a. Kalan : Arslan Tilki
	        String s3 = stack.peek(); //Tilki'yi g�r�r. s3=Tilki.
	        String s4 = stack.pop();  //Ve Tilki'yi siler.  s3=Tilki
	        
	        System.out.println(s1); 
	        System.out.println(s2);
	        System.out.println(s3); 
	        System.out.println(s4);
	        System.out.println("Kalan : "+ stack);
	        
	}

}
