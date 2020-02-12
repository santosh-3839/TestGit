import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatefromArrayList {

	public static void main(String[] args) {
		
		List<Integer> al=new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,3,7,9,10));
		System.out.println("ArrayList with Duplicate :"+al);
		//to remove the duplicate from Arraylist we call the distinct methods
		List <Integer> newList=al.stream().distinct().collect(Collectors.toList());
		System.out.println("The ArrayList with Duplicate removed are :"+newList);
		

	}

}
