class Bike{
	final void run()
	{
		System.out.println("Running method");
	}
}


public class FinalvariableExamp extends Bike {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new FinalvariableExamp().run();
		
		
	}

}

//We can inherit the funal variable in the child class by can not override it.
