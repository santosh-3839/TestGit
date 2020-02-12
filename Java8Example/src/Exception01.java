
public class Exception01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Before Try block");
		 int a=10;
		 int b=0;
		
		try {
			System.out.println("I m from try block");
		   }
		
		catch(Exception e) {
			
			e.printStackTrace();
			}
		
		finally {
			System.out.println("i m from finally block");
		     }

	}

}
