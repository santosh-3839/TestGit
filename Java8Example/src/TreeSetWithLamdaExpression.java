import java.util.TreeSet;

public class TreeSetWithLamdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet <Integer>  ts=new TreeSet<Integer>();
		ts.add(10);
		ts.add(5);
		ts.add(-1);
		ts.add(20);
		System.out.println("Default Sorting Order is:"+ts);
		
		TreeSet <Integer>  ts1=new TreeSet<Integer>(
				(i1,i2)->(i1>i2)?-1:(i1<i2)?1:0
				);
		ts1.add(10);
		ts1.add(5);
		ts1.add(-1);
		ts1.add(20);
		System.out.println("Default Sorting Order is:"+ts1);
     
     
		

	}

}
