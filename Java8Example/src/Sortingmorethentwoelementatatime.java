import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student123 {
	
	   String firstname,lastname;
	
	public Student123(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "Student123 [firstname=" + firstname + ", lastname=" + lastname + "]";
	}
	
}//Student class

class FirstName implements Comparator<Student123>
{
    @Override
	public int compare(Student123 a, Student123 b) {
		// TODO Auto-generated method stub
		return a.firstname.compareTo(b.firstname);
	}
	
}//

class LastName implements Comparator <Student123>
{
   @Override
	public int compare(Student123 a, Student123 b) {
		// TODO Auto-generated method stub
		int lname=a.lastname.compareTo(b.lastname);
		return ((lname==0)? a.firstname.compareTo(b.firstname):lname);
	}
	
}//class


public class Sortingmorethentwoelementatatime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Student123>  al=new ArrayList<Student123>();
		al.add(new Student123("DDDDD","Kumar"));
		al.add(new Student123("MMMM","Singh"));
		al.add(new Student123("TTTT","Rajput"));
		
		System.out.println("The Unsorted list are:");
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		Collections.sort(al,new LastName());
		
        System.out.println("The Sorted Firstname and last anme is no is:");
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		

	}

}

// this is for default sorting order
//if you change the order of compare method then that will be decending order sorting



	

