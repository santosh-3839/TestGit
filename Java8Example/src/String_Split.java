
public class String_Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Split method
		String str="How-are-you";
		String parts[]=str.split("-");//regular expression
		String parts1[]=str.split("-",2);//regular expression
		for(int i=0;i<parts.length;i++)
		{
			System.out.println("the part value is --------"+parts[i]);
		}

		
		for(int i=0;i<parts1.length;i++)
		{
			System.out.println("the part value is --------"+parts1[i]);
		}
	}

}
