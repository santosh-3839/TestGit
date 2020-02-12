import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sorting01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Integer> al =new ArrayList<Integer>();
		al.add(10);
		al.add(5);
		al.add(0);
		al.add(20);
		al.add(25);
		al.add(27);
		System.out.println(al);
		//Default Sorting order
		Collections.sort(al);
		System.out.println("This is defaullt Sorting Order:"+ al);
		//userdefine sorting order
		Collections.sort(al,new MySorting());
		System.out.println("This is userdefine Sorting Order:"+al);//decending order Sorting
		
}

}//Class

class MySorting implements Comparator<Integer>
{
	public int compare(Integer i1,Integer i2)
	{
		/*
		 * if(i1>i2) { return -1; }
		 * 
		 * else if(i1<i2) { return 1; } else { return 0; }
		 */
		
		//by using the lambda expression
		return (i1>i2)?-1:(i1<i2)?1:0;
	}//method
}//class
