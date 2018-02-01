package Polymorphism;

public class B extends A {
	
	public B()
	{
		super("A");
		System.out.println("B");
	}
	public B(String soyad)
	{
		this();
	}
	public B(String soyad, int yas)
	{
		this("soyad");
		System.out.println("++B");
	}
}
