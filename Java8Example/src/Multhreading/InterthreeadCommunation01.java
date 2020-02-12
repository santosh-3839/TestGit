package Multhreading;

class Calculator extends Thread
{
	long sum;
	
	public void run()
	{
		synchronized (this) {
			
			for(int i=0;i<100;i++)
			{
				sum+=i;
			}
			
			notify();
		}
	}
}//Child class

public class InterthreeadCommunation01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator c1=new Calculator();
		c1.start();
		synchronized (c1) {
			try {
				c1.wait();
			    }
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
		System.out.println("The Sum value is:"+c1.sum);
		

	}

}
