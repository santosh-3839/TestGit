@FunctionalInterface
interface Interf{
	
	public void add(int a,int b);
	//public void sub(int a,int b);
	
	default void m2()
	{
		System.out.println("HI i am from default method");
	}
	
	static void m3()
	{
		System.out.println("Hi i am from sttic method");
	}
	
}

class Test {

	public static void main(String[] args) {
		
		Interf i1=(a,b)->System.out.println("the Sum is:"+(a+b));
		i1.add(10,23);
		i1.m2();
		Interf.m3();
		
		
		
		

	}

}
