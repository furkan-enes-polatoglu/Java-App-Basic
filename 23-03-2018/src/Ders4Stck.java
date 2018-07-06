import java.util.Stack;
public class Ders4Stck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//SON GÝREN ÝLK ÇIKAR (ÇUVAL)
		
		//peek görür
		//push ekler
		//pop çýkartýr
	        
	        
	        Stack<String> stack = new Stack<String>();
	        stack.push("Arslan");
	        stack.push("Tilki");
	        stack.push("Kedi");       
	        stack.pop();
	        stack.push("Kurbaða");
	        
	        //Arslan Tilki Kurbaða
	        
	        String s1 = stack.peek(); //Kurbaða'yý görür. s1 : Kurbaða
	        String s2 = stack.pop();  //Ve Kurbaða'yý siler. s2=Kurbaða. Kalan : Arslan Tilki
	        String s3 = stack.peek(); //Tilki'yi görür. s3=Tilki.
	        String s4 = stack.pop();  //Ve Tilki'yi siler.  s3=Tilki
	        
	        System.out.println(s1); 
	        System.out.println(s2);
	        System.out.println(s3); 
	        System.out.println(s4);
	        System.out.println("Kalan : "+ stack);
	        
	}

}
