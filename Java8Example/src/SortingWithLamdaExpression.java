import java.util.ArrayList;
import java.util.Collections;

public class SortingWithLamdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Integer>al=new ArrayList<Integer>();
		al.add(10);
		al.add(0);
		al.add(5);
		al.add(20);
		al.add(50);
		System.out.println(al);
		Collections.sort(al);
		System.out.println("The Acending Order Sorting is:"+al);
		Collections.sort(al,(i1,i2)->(i1>i2)?-1:(i1<i2)? 1:0);
		System.out.println("The Decending Order Sorting is:"+al);
		}

}
