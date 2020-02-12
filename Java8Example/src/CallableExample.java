import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		//creating Thread pool to execute task which implement callable.
		ExecutorService es=Executors.newSingleThreadExecutor();
		System.out.println("Submitted Callable task to calculate factorial of 10");
		Future<Long> result10=es.submit(new FactorialCalculator(10));
		System.out.println("Calling get method of Future to fetch resul of factorial");
		long factvalue10=result10.get();
		System.out.println("Factorial value of 10 is:"+factvalue10);

	}//main

}//class


class FactorialCalculator implements Callable<Long>
{
	private int number;

	public FactorialCalculator(int number) {
		this.number = number;
	}
	
	public Long call() throws Exception
	{
		return factorial(number);
	}

	private Long factorial(int n) throws InterruptedException {
		//to calculate factorial value
		long result=1;
		
		while(n!=0)
		{
			result=n*result;
			n=n-1;
			Thread.sleep(100);
		}
		// TODO Auto-generated method stub
		return result;
	}
	
}
