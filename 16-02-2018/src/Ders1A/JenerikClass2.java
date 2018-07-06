package Ders1A;

public class JenerikClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JenerikClass<String> furkan = new JenerikClass<String>();
		furkan.setDeger("Bilgisayar Jenerik Sýnýfý");
		System.out.println(furkan.getDeger());
		
		JenerikClass<Double> furkan2 = new JenerikClass<Double>();
		furkan2.setDeger(5.78);
		System.out.println(furkan2.getDeger());
		
		JenerikClass<Integer> furkan3 = new JenerikClass<Integer>();
		furkan3.setDeger(10);
		System.out.println(furkan3.getDeger());
		
	

	}

}
