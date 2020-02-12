import java.util.Scanner;

public class FibonacciExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int maxnumber=0;
		   int previousnumber=0;
		   int nextnumber=1;
		   System.out.println("Enter the maximum Fibonacci Number");
		   Scanner sc=new Scanner(System.in);
		   maxnumber=sc.nextInt();
		   System.out.print("The mximum number is "+ maxnumber +"number:");
		   
		   for(int i=1;i<=maxnumber;i++)
		   {
			   System.out.print(previousnumber+" ");
			   
			   int sum=previousnumber+nextnumber;
			   previousnumber=nextnumber;
			   nextnumber=sum;
		   }//for

	}

}
