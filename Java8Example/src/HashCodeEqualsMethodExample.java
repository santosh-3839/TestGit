import java.util.HashMap;
import java.util.Map;
//if we r not overriding hashcode and equals menthods then Hashmap is giving the size is :2
//it means duplicate entry is possible.
//But if we r implementing hashcode and equals methods then wr r not getting any duplicate entry in hashmap
public class HashCodeEqualsMethodExample {

	public static void main(String[] args) {
		Employee emp1=new Employee(1);
		Employee emp2=new Employee(1);
		Map<Employee,String> map=new HashMap<Employee,String>();
		map.put(emp1,"jack");
		map.put(emp2,"jack");
		System.out.println(map.size());
		System.out.println(map.entrySet());
		
		Integer i1=new Integer(1);
		Integer i2=new Integer(1);
		
		Map<Integer,String> map1=new HashMap<Integer,String>();
		map1.put(i1,"one");
		map1.put(i2,"one");
		System.out.println(map1.size());
		

	}

}


class Employee
{
	int id;

	public Employee(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}
}
