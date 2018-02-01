package Polymorphism;

public class C extends B {
	
	public C()
	{
		this(12);
		System.out.println("C");
	}
	
	public C (int yas)
	{
		super();
		System.out.println("+C+");
	}

}
