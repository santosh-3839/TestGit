import java.util.function.Predicate;

public class PredicateInterface01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Predicate <Integer> p1=i->i>10;
	System.out.println(p1.test(20));	

	}

}
