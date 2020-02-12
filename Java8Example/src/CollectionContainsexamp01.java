import java.util.ArrayList;

public class CollectionContainsexamp01 {

	public static void main(String[] args) {
		
		Employee123 emp1=new Employee123(1,"santosh","pune");
		Employee123 emp2=new Employee123(2,"Antosh","Gaya");
		
		ArrayList<Employee123> al=new ArrayList<Employee123>();
		al.add(emp1);
		al.add(emp2);
		
		System.out.println(al);
		System.out.println("List contains is  "+al.contains(emp1));
		
		
		

	}

}


class Employee123
{
	int id;
	String name;
	String address;
	public Employee123()
	{
		
	}
	public Employee123(int id, String name, String address) {
		
		this.id = id;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee123 [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
