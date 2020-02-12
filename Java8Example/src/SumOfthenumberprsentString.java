
public class SumOfthenumberprsentString {

	public static void main(String[] args) {
		
		String s="s16u7ty6";
		int c=0;
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);//getting each char from the String
			int x=(int)ch;
			for(int y=48;y<=57;y++)//loop for checking the ASCII value
			{
				if(x==y) {
					int num=Integer.parseInt(""+ch);//getting the int value
					c=c+num;
				}//if
			}//for
		}//for
		
		System.out.println("The total Sum is :"+c);

	}

}
