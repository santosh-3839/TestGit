interface Left
{
	default void m1()
	{
		System.out.println("I am from Left interface");
	}
}

interface Right
{
	default void m1()
	{
		System.out.println("I am from Right interface");
	}
}


public class DefaultMethodInterface01 implements Left,Right {
	
	public void m1()
	{
		//System.out.println("I am from overriden class method");
		Left.super.m1();
		Right.super.m1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DefaultMethodInterface01 t1=new DefaultMethodInterface01();
		t1.m1();

	}

}
