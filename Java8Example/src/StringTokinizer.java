import java.util.StringTokenizer;

public class StringTokinizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="java is a programming language";
		StringTokenizer st=new StringTokenizer(str);
		
		while(st.hasMoreElements())
		{
			System.out.println(st.nextElement());
		}

	}

}
