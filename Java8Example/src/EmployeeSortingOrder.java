import java.util.ArrayList;
import java.util.Collections;

public class EmployeeSortingOrder {
	
	int eno;
	String ename;
	
	public EmployeeSortingOrder(int eno, String ename) {
		
		this.eno = eno;
		this.ename = ename;
	}
	
	@Override
	public String toString() {
		return " [eno=" + eno + ", ename=" + ename + "]";
	}

   public static void main(String[] args) {
		// TODO Auto-generated method stub
	   
	   ArrayList<EmployeeSortingOrder> al=new ArrayList <EmployeeSortingOrder>();
	   al.add(new EmployeeSortingOrder(10,"Kumar") );
	   al.add(new EmployeeSortingOrder(0,"Singh") );
	   al.add(new EmployeeSortingOrder(-1,"Santosh") );
	   al.add(new EmployeeSortingOrder(20,"Neetu") );
	   
	   System.out.println("Before Sorting"+al);
	   //Sorted in acending order
	   Collections.sort(al,
			  (e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno<e2.eno)?1:0
			   );
	   
	   System.out.println("After Sorting:"+al);
	   
	   //Sorted in decending order
	   Collections.sort(al,
			  (e1,e2)->(e1.eno>e2.eno)?-1:(e1.eno<e2.eno)?1:0
			   );
	   
	   System.out.println("After Sorting:"+al);
	   
	   

	}

}
