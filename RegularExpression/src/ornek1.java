import java.util.regex.Pattern;

public class ornek1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		//System.out.println(Pattern.matches("'.*@.*'", "'ibrahim.ozcan@dpu.edu.tr'" ));
     // System.out.println("'Bu ev'".matches("'.*'"));
      
		
      
         /*
		  Kurallar
		  
		  X? Bir Kere Ya da Hiç Kere Kullanýlabilir
		  X* Hiçbir kere ya da Ýstenilen kadar Kullanýlabilir.
		  X+ Bir Kere ya da istenilen kadar Kullanýlabilir
		  
		  
		  [abcdef]  a,b,c,d,e ve f harflerinden herhangi birisi
		  [^abcdef] a,b,c,d,e ve f harflerinden hiçbirisi
		  [0-9a-zA-Z]  0ile 9 arasýndaki rakamlardan biri ya da a dan z ye harflerden biri
		  
	******************************************************************************************
		 
	     .             Her iþaret
	     \d            Sayýlar[0-9]
	     \D			   Sayý Olmayanlar [^0-9]
	     \s			   boþluk
	     \S 		   boþluk OLMAYAN
	     \w			   Kelime karakteri[a-zA-Z0-9]
	     \W			   Kelime karakteri DEÐÝL */
		
      
      
      	//System.out.println(Pattern.matches("[0123456789]", "1978" ));
		
      	//String s1 = "BC  43--   ";
		//System.out.println(s1.matches("(\\S*\\D*\\W\\S*\\W*)"));
		//System.out.println(s1.matches("(\\D*\\W\\S*\\W*\\D)"));
		//System.out.println(s1.matches("(\\w*\\s*\\d*\\S*\\s*)"));
		//System.out.println(s1.matches("(\\D*\\S*\\d\\S*\\W*)"));

		System.out.println(Pattern.matches("[01]","01"));
		
		//System.out.println(Pattern.matches("[01]*","01"));
		//System.out.println(Pattern.matches("[01]?","11"));
		//System.out.println(Pattern.matches("[01]","0011"));
		
		//System.out.println(Pattern.matches("[^abc]","z"));
		//System.out.println(Pattern.matches("[0-9A-Za-z]","8"));
		//System.out.println(Pattern.matches("[0-9a-z]*",""));
		//System.out.println(Pattern.matches("[abc]?","abc"));

		
      	//String s1 = "423-4124-43     AB";
      	//System.out.println(s1.matches("(\\d{3}-*\\d{2,}-*\\d{1,}\\s*\\w*)"));
      	//System.out.println(s1.matches("(\\d{1,}-?\\d{2,}-?\\d{1,}\\s*\\w*)"));
      	//System.out.println(s1.matches("(\\d{3}-?\\d{3}.+\\d{2}\\s*\\w*)"));
      //	System.out.println(s1.matches("(\\d{1,3}-?\\d{1,4}-?\\d{1,2}\\s*\\W*AB)"));


			//System.out.println(Character.isDigit('12'));
			//System.out.println(Character.isLetter("ab"));
		//	System.out.println(Character.isDigit('9'));
			//System.out.println(Character.isWhitespace('a  a'));
	     	//System.out.println(Character.isLetter('b'));


	}

}
