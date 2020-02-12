package Multhreading;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorService01 implements Runnable {

	public static void main(String[] args) {
		
		ExecutorService es1=Executors.newSingleThreadExecutor();
		ExecutorService es2=Executors.newFixedThreadPool(10);
		ExecutorService es3=Executors.newScheduledThreadPool(10);
		
		es3.execute(new ExecutorService01() 
				{ 
			      
			      public void run()
			      {
			    	  System.out.println("i am from child class1234567");
			      }
				});
		
		 es3.shutdown();
		}//main

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}



}//class
