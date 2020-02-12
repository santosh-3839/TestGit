import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(0);
		al.add(2);
		al.add(5);
		al.add(12);
		System.out.println("The Arraylist value is:"+al);
		
		//Using Stream Api to filter out the even no.
		List <Integer> l=al.stream().filter(i1->i1%2==0).collect(Collectors.toList());
		System.out.println("The list of Even No is :"+l);
		
		//Using Stream Api to double the existing ArrayList object
		List <Integer> l1=al.stream().map(i1->i1*2).collect(Collectors.toList());
		System.out.println("The list of Double No is :"+l1); 
		
		
		//By using count() methods
		
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("Aurangabad");
		al1.add("Santosh");
		al1.add("kumar");
		al1.add("Sumit");
		al1.add("Rakesh");
		System.out.println("The Arraylist value is:"+al1);
		long count=al1.stream().filter(s1->s1.length()>=7).count();
		System.out.println("The Counted value are:"+count);
		
		
		//By using Default sorted() method
		
		ArrayList<Integer> al2=new ArrayList<Integer>();
		al2.add(-1);
		al2.add(20);
		al2.add(10);
		al2.add(5);
		al2.add(2);
		System.out.println("The UnSorted Arraylist value is:"+al2);
		
		List<Integer> l2=al2.stream().sorted().collect(Collectors.toList());
		
		System.out.println("The Default Sorted Arraylist value is:"+l2);
		
		
		//By using Customize order Sorting
		
				ArrayList<Integer> al3=new ArrayList<Integer>();
				al3.add(-1);
				al3.add(20);
				al3.add(10);
				al3.add(5);
				al3.add(2);
				System.out.println("The UnSorted Arraylist value is:"+al3);
				
				List<Integer> l3=al3.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
				
				System.out.println("The Customize Sorted Arraylist value is:"+l3);
				
				
				//how to find min () and max() value from collectiion
				
				ArrayList<Integer> al4=new ArrayList<Integer>();
				al4.add(-1);
				al4.add(20);
				al4.add(10);
				al4.add(5);
				al4.add(2);
				System.out.println("The UnSorted Arraylist value is:"+al4);
				
				Integer l5=al4.stream().min((i1,i2)->i1.compareTo(i2)).get();
				
				System.out.println("The Minimum Value of Arraylist value is:"+l5);
				
				// max() value from collection List
				
				ArrayList<Integer> al5=new ArrayList<Integer>();
				al5.add(-1);
				al5.add(20);
				al5.add(10);
				al5.add(5);
				al5.add(2);
				System.out.println("The UnSorted Arraylist value is:"+al5);
				
				Integer l6=al5.stream().max((i1,i2)->i1.compareTo(i2)).get();
				
				System.out.println("The Maxium Value of Arraylist value is:"+l6);
				
				//ForEach() method
				ArrayList<Integer> al6=new ArrayList<Integer>();
				al6.add(-1);
				al6.add(20);
				al6.add(10);
				al6.add(5);
				al6.add(2);
				System.out.println("The UnSorted Arraylist value is:"+al6);
				
				al6.stream().forEach(System.out::println);
				
				
				//toArray() method call
				ArrayList<Integer> al7=new ArrayList<Integer>();
				al7.add(-1);
				al7.add(20);
				al7.add(10);
				al7.add(5);
				al7.add(2);
				System.out.println("The UnSorted Arraylist value is:"+al7);
				
				Integer[] array=al7.stream().toArray(Integer[]::new);
				
				for(Integer x : array)
				{
					System.out.println("The Array element are :"+x);
				}
				
				
				//of() method call
				ArrayList<Integer> al8=new ArrayList<Integer>();
				al8.add(-1);
				al8.add(20);
				al8.add(10);
				al8.add(5);
				al8.add(2);
				System.out.println("The UnSorted Arraylist value is:"+al8);
			    Stream <Integer>s=Stream.of(9,99,999,9999,99999);
			    s.forEach(System.out::println);
				
			   //For Array elements
			    
			    Double[] d1= {10.2,11.5,4.5,7.8};
			    Stream<Double> s1=Stream.of(d1);
			    s1.forEach(System.out::println);
			   
			   
			
				
				
				
				
		
		
		
		
		
		

	}

}
