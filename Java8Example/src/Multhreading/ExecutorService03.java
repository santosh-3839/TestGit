package Multhreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorService03 implements Callable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		
		ExecutorService es03=Executors.newSingleThreadExecutor();
		
		Future f2=es03.submit(new ExecutorService03() {
			public Object call() throws Exception {
				// TODO Auto-generated method stub
				return "Callable result";
			}
		});

	System.out.println("Future Object is:" +f2.get());
	
	}//main

	@Override
	
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
 
}//class

