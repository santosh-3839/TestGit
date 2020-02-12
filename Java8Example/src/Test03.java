interface ABCD{
	
	public void add(int a, int b);
}
public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ABCD ab=(a,b)->System.out.println(" The added value is :"+(a+b));
		
		ab.add(10,30);

	}

}
