import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DivisionBy5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Integer> al=new ArrayList<Integer>(Arrays.asList(1,5,10,20));
		List <Integer>al1=al.stream().filter(i->i%5==0).collect(Collectors.toList());
		System.out.println("The list elements are :"+al1);

	}

}
