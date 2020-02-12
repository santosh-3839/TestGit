interface ABCDEFG
{
	public static void m1()
	{
		System.out.println("I am from Static method");
	}
}
public class StaticMethodInterface implements ABCDEFG {
	
	public static void m1()
	{
		System.out.println("I am from Child Static method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StaticMethodInterface s1=new StaticMethodInterface();
		s1.m1();
		StaticMethodInterface.m1();
		//interface name call
		ABCDEFG.m1();
	}

}
