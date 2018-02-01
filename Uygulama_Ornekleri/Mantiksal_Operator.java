
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
		   & bit düzeyinde "VE" iþlemi
		   | bit düzeyinde "VEYA" iþlemi
		   ^ bit düzeyinde "XOR" iþlemi (ayrýcalýklý VEYA)
		   && "Lojik VE" iþlemi
		   || "Lojik VEYA" iþlemi
		   ?: "Seçme" Operatörü
		   = "Atama" Operatörü
		   == "Eþit" Operatörü
		   != "Eþit Deðil" Operatörü
		   
	    */
		
		System.out.println(true | false); // TRUE
		System.out.println(true & false); // FALSE
		System.out.println(true^false);
		System.out.println(3|5);
		
		int l =(int) 5.2345;
		System.out.println(l);

	}

}
