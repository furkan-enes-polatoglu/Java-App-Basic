
public class YazdirmaSinifi <E> {
	
	public void yazdir(E[] dizi)  //E Global deðiþkendir. Her türlü tip gelir.
	{
		for(E e : dizi)
		{
			System.out.println(e);
		}
	}

}
