
public class Palidrome01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="123";
		String temp="";
		int a=s1.length();
		
		for(int i=a-1;i>=0;i--)
		{
			temp=temp+s1.charAt(i);
		}
		
		System.out.println("The reverse String is:"+temp);
		
		if(temp.equals(s1))
		{
			System.out.println("The given String is palidrome :"+s1);
		}
		
		else {
			System.out.println("The given String is not palidrome :"+s1);
		}

	}

}
