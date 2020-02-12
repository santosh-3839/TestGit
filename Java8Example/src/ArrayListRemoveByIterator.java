import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListRemoveByIterator {

	public static void main(String[] args) {
		List <Integer> number=new ArrayList<Integer>();
		number.add(101);
		number.add(100);
		number.add(301);
		number.add(400);
		System.out.println("Arraylist Before :"+number);
		Iterator<Integer> itr=number.iterator();
		//remove all the even number
		//Exception in thread "main" java.util.ConcurrentModificationException
		while(itr.hasNext())
		{
			Integer numbers=itr.next();
			
			if(numbers%2==0)
			{
				//number.remove(numbers);//called Arraylist remove method
				itr.remove();//called Iterator remove method
			}
		}
		
		System.out.println("The ArrayList number will be :"+number);

	}

}
