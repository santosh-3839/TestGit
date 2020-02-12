import java.util.PriorityQueue;

public class PriorityQueue01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue pq=new PriorityQueue();
		pq.add("santosh");
		pq.add("mohan");
		pq.add("uma");
		pq.add("tata");
		System.out.println(pq);
		
		while(pq.isEmpty())
		{
			System.out.println("The remove method is:"+pq.remove());
		}

	}

}
