import java.util.LinkedList;
import java.util.Queue;

public class Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �LK G�REN �LK �IKAR
		
		//offer ekler
		//poll ��kart�r
				
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
	          while (!kuyruk.isEmpty())
	            System.out.println(kuyruk.poll());
		

	}

}
