
public class YazdirmaSinifi <E> {
	
	public void yazdir(E[] dizi)  //E Global de�i�kendir. Her t�rl� tip gelir.
	{
		for(E e : dizi)
		{
			System.out.println(e);
		}
	}

}
