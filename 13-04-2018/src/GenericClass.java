public class GenericClass {

	public static void main(String[] args) {
		
		
		
		Character[] char_dizi = {'J','A','V','A'};
		Integer[] integer_dizi = {1,2,3,4,5,6};
		String[] string_dizi = {"Java","Python","C++","PHP"};
		Ogrenci[] ogrenci_dizi = {new Ogrenci("Furkan"), new Ogrenci("Salih"), new Ogrenci("Berk")};
		
		/*CharYazdir.yazdir(char_dizi);
		System.out.println("***********************");
		IntegerYazdir.yazdir(integer_dizi);
		System.out.println("***********************");
		StringYazdir.yazdir(string_dizi);
		System.out.println("***********************");
		OgrenciYazdir.yazdir(ogrenci_dizi);*/
		
		YazdirmaSinifi<Character> yazdir_char = new YazdirmaSinifi<Character>();
		YazdirmaSinifi<Integer> yazdir_integer = new YazdirmaSinifi<Integer>();
		YazdirmaSinifi<String> yazdir_string = new YazdirmaSinifi<String>();
		YazdirmaSinifi<Ogrenci> yazdir_ogrenci = new YazdirmaSinifi<Ogrenci>();
		
		yazdir_char.yazdir(char_dizi);
		yazdir_integer.yazdir(integer_dizi);
		yazdir_string.yazdir(string_dizi);
		yazdir_ogrenci.yazdir(ogrenci_dizi);
		
	}

}
