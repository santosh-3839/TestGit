@FunctionalInterface
 interface A01 {
	
	public void m1();
	//public void m4();
	
	default void m2()
	{
		System.out.println("i am from default method");
	}
	
	public static void m3()
	{
		System.out.println("i am from static method");
	}

}//interface

public class Test01 implements A01
{
	
	public void m1()
	{
		System.out.println("i m overriden method");
		
		m2();
		//this.m3();
		
	}
	public static void main(String k[])
	{
		Test01 t1=new Test01();
		t1.m1();
		
	}
}


