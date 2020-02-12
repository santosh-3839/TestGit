package Multhreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorService02 implements Runnable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		
		ExecutorService es01=Executors.newSingleThreadExecutor();
		Future f1=es01.submit(new ExecutorService02()
				{
			      public void run()
			      {
			    	  System.out.println("i am from Child Future Class");
			      }
				});
		
		f1.get();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
