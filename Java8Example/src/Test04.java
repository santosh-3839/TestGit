
 interface ABCDE {

	public int getlength(String s);
}

 public class Test04 
   {
	public static void main(String k[])
	{
		ABCDE abc=(s)->s.length();
		System.out.println(abc.getlength("SANTOSH"));
	}
	
   
}
