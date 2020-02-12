
public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r1=()->{
			for (int i=0;i<=10;i++)
			{
				System.out.println(" i am child thread");
			}
		};
		
		Thread t1=new Thread(r1);
		t1.start();
		
		for(int i=0;i<=10;i++)
		{
			System.out.println("I am from Parent class");
		}
		

	}

}
