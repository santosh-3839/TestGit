
public class MethodOVERLOADINGTEST {
	
	public void m1(String s) {
		System.out.println("I am from M1 method");
	}
	
	public void m1(Object s1)
	{
		System.out.println("I am from Object method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOVERLOADINGTEST m2=new MethodOVERLOADINGTEST();
		m2.m1(null);
		

	}

}
