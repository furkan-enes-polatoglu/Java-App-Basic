
import java.util.LinkedList;
import java.util.Queue;

public class Ders3Que {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�LK G�REN �LK �IKAR
		//poll  :  ��kart�r.
		//offer :  ekler

		Queue<String> kuyruk = new LinkedList<String>();
        kuyruk.offer("Kartal");
        kuyruk.offer("kalkar");
        kuyruk.offer("dal");
        kuyruk.offer("sarkar");
        kuyruk.poll();
        kuyruk.offer("dal");
        kuyruk.offer("dal sarkar");
        kuyruk.poll();
        kuyruk.offer("Kartal kalkar");
        
          while (!kuyruk.isEmpty()) //kuyruk bo�almad��� s�rece
            System.out.println(kuyruk.poll()); //yazd�r�p ��kar�yor, sonra s�radakini yazd�r�yor.
	}

}
