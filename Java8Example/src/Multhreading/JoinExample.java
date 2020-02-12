package Multhreading;

class Thread123 extends Thread{
	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(" I am from child Thread");
		}
		
		/*
		 * try {
		 * 
		 * Thread.sleep(2000); } catch(InterruptedException e) { e.printStackTrace(); }
		 */
	}//run method
}//class

public class JoinExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Thread123 t1=new Thread123();
		t1.start();
		t1.join();
		
		for(int i=0;i<10;i++)
		{
			System.out.println(" i m from main Thread");
		}

	}

}
