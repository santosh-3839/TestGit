import java.util.HashMap;
import java.util.IdentityHashMap;

public class HashMap01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap <Integer,String> m1=new HashMap<Integer,String>();
		m1.put(101, "santosh");
		m1.put(102,"Antosh");
		System.out.println(m1);
		
		IdentityHashMap<Integer,String> m2=new IdentityHashMap<Integer,String>();
		m2.put(101,"Ram");
		m2.put(102,"Sita");
		
		System.out.println(m2);

	}

}
