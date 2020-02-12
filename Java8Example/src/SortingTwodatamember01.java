import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
	
	int rollno;
	String name;
	
public Student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
@Override
public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	
}//Student class

class Sortbyroll implements Comparator<Student>
{
    @Override
	public int compare(Student b, Student a) {
		// TODO Auto-generated method stub
		return a.rollno - b.rollno;
	}
	
}//Sortbyroll

class SortbyName implements Comparator <Student>
{

	@Override
	public int compare(Student b, Student a) {
		// TODO Auto-generated method stub
		return a.name.compareTo(b.name);
	}
	
}//class


public class SortingTwodatamember01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Student>  al=new ArrayList<Student>();
		al.add(new Student(101,"Santosh"));
		al.add(new Student(103,"Aantosh"));
		al.add(new Student(102,"Mantosh"));
		
		System.out.println("The Unsorted list are:");
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		Collections.sort(al,new Sortbyroll());
		
        System.out.println("The Sorted roll no is:");
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		Collections.sort(al,new SortbyName());
		System.out.println("The Sorted Name is:");
			
			for(int i=0;i<al.size();i++)
			{
				System.out.println(al.get(i));
			}
		

	}

}

// this is for default sorting order
//if you change the order of compare method then that will be decending order sorting
