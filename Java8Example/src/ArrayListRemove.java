import java.util.ArrayList;
import java.util.List;

public class ArrayListRemove {

	public static void main(String[] args) {
		
		List<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		System.out.println("The Arraylist contains :"+al);
		al.remove(1);//based on index
		System.out.println("After removing the element from index 1 :"+al);
		//java.lang.IndexOutOfBoundsException: Index: 3, Size: 2
		/*
		 * al.remove(3);
		 * System.out.println("After removing the element from index 3 :"+al);
		 */
		//calling remove(Object)
		al.remove(new Integer(3));
		System.out.println("After removing the element from index 3 :"+al);
		
		

	}

}
