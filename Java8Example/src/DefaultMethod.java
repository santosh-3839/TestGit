interface A{
	default void m1()
	{
		System.out.println("I m from default method");
	}
	

}

class DefaultMethod implements A {
	
	public void m1()
	{  
		A.super.m1();
		System.out.println("I m from overloaded class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DefaultMethod d1=new DefaultMethod();
		d1.m1();

	}

}
