import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Ders2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Object> list = new ArrayList<Object>();
        Collections.addAll(list,"b","c","d");
        
        ListIterator<Object> it = list.listIterator(); //listeyi list iterat�r yaparak linklendirdik.
        it.add("a"); //listenin ba��na ekler.
        System.out.println(list);
        it.next(); //ba�tan ba�layarak next der ve b'ye gelir.
        it.remove(); //b'yi siler.
        System.out.println(list); 
        it.next(); //acd �uanki hali iken en ba�tan ba�layarak next eder c'ye gelir.
        it.set("i"); //daha sonra c'de iken c'yi i ile de�i�tirir. aid olur.
        System.out.println(list);
        it =list.listIterator(list.size()-1); //iterat�r�n i�ine listenin 012 elemanlar�ndan 1 ��kar�p yani 01 der.
        it.add("l"); //012. indexlerin devam�na l ekler 
        it.add("v"); //012. indexlerinin devam�na v ekler.
        System.out.println(list);
        it.previous();
        it.remove();
        System.out.println(list);
		
		//abcd

	}

}
