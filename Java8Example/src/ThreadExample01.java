class Test123 implements Runnable{
	
	public void run()
	{
		//System.out.println("Hi i m from run method");
	}
	
}
class ThreadExample01  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t=new Thread();
		t.start();
		//System.out.println(" I m from main method");
		

	}

}
