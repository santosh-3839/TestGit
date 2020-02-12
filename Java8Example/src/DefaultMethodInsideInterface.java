interface ABCDEF{
	
	default void m1()
	{
		System.out.println("I m from default method");
	}
}

public class DefaultMethodInsideInterface implements ABCDEF{
	
	//Overriding default method
	/*
	 * public void m1() { ABCDEF.super.m1();
	 * System.out.println("i am from Implementation class method"); }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DefaultMethodInsideInterface di=new DefaultMethodInsideInterface();
		di.m1();
		/*
		 * ABCDEF a1=new DefaultMethodInsideInterface(); a1.m1();
		 */
 
	}

}
