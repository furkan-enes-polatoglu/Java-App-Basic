import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Ders2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Object> list = new ArrayList<Object>();
        Collections.addAll(list,"b","c","d");
        
        ListIterator<Object> it = list.listIterator(); //listeyi list iteratör yaparak linklendirdik.
        it.add("a"); //listenin baþýna ekler.
        System.out.println(list);
        it.next(); //baþtan baþlayarak next der ve b'ye gelir.
        it.remove(); //b'yi siler.
        System.out.println(list); 
        it.next(); //acd þuanki hali iken en baþtan baþlayarak next eder c'ye gelir.
        it.set("i"); //daha sonra c'de iken c'yi i ile deðiþtirir. aid olur.
        System.out.println(list);
        it =list.listIterator(list.size()-1); //iteratörün içine listenin 012 elemanlarýndan 1 çýkarýp yani 01 der.
        it.add("l"); //012. indexlerin devamýna l ekler 
        it.add("v"); //012. indexlerinin devamýna v ekler.
        System.out.println(list);
        it.previous();
        it.remove();
        System.out.println(list);
		
		//abcd

	}

}
