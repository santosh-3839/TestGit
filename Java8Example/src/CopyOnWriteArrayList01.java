import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArrayList01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CopyOnWriteArrayList al=new CopyOnWriteArrayList();
		
		al.add(10);
		al.add(20);
		al.add(null);
		al.add("Santosh");
		System.out.println(al);
		
	CopyOnWriteArraySet al1=new CopyOnWriteArraySet();
		
		al1.add(10);
		al1.add(20);
		al1.add(null);
		al1.add("Mukesh");
		System.out.println(al1);
		
		ConcurrentHashMap mp=new ConcurrentHashMap();
		mp.put(10,"santosh");
		mp.put(20,"Antosh");
		//null is not allowed
		//mp.put(null,"mukesh");
		System.out.println(mp);

	}

}
