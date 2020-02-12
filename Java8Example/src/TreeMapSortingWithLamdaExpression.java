import java.util.TreeMap;

public class TreeMapSortingWithLamdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		
		tm.put(10,"kumar");
		tm.put(0,"Santosh");
		tm.put(-1,"Alok");
		tm.put(20,"Neetu");
		tm.put(30,"Singh");
		System.out.println("Default natural Sorting Order is:"+tm);
		
TreeMap<Integer,String> tm1=new TreeMap<Integer,String>(
		
		(i1,i2)->(i1>i2)?-1:(i1<i2)?1:0
		);
		
		tm1.put(10,"kumar");
		tm1.put(0,"Santosh");
		tm1.put(-1,"Alok");
		tm1.put(20,"Neetu");
		tm1.put(30,"Singh");
		System.out.println("Customize natural Sorting Order is:"+tm1);
		

	}

}
