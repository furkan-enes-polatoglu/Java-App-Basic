
public class Mantiksal_Operator {

	public static void main(String[] args) {
		int i=99;
		int j=-99;
		int k=0;
		
		System.out.println(i++);
		System.out.println(++i-j--); //(+101)-(-99) = 200
		System.out.println(j++-++k); // (-100)-(+1) = -101
		System.out.println(k++);
		
		/* 
		   & bit d�zeyinde "VE" i�lemi
		   | bit d�zeyinde "VEYA" i�lemi
		   ^ bit d�zeyinde "XOR" i�lemi (ayr�cal�kl� VEYA)
		   && "Lojik VE" i�lemi
		   || "Lojik VEYA" i�lemi
		   ?: "Se�me" Operat�r�
		   = "Atama" Operat�r�
		   == "E�it" Operat�r�
		   != "E�it De�il" Operat�r�
		   
	    */
		
		System.out.println(true | false); // TRUE
		System.out.println(true & false); // FALSE
		System.out.println(true^false);
		System.out.println(3|5);
		
		int l =(int) 5.2345;
		System.out.println(l);

	}

}
