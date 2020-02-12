import java.util.HashMap;
import java.util.Iterator;

public class DuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		duplicateCharacter("Java2eee");

	}

	private static void duplicateCharacter(String str) {
		
		HashMap<Character, Integer> hm=new HashMap<Character,Integer>();
		
		for(int i=0;i<str.length();i++)
		   {  
			char c=str.charAt(i);
			
			if(hm.get(c)!=null)
			{
				hm.put(c,hm.get(c)+1);
			}
			
			else {
				  hm.put(c,1);
			     }
		}//for
		
		Iterator<Character> c=hm.keySet().iterator();
		
		while(c.hasNext())
		{
			char temp=c.next();
			
			if(hm.get(temp)>1)
				
			{
		      System.out.println("The character " + temp + " append "+ hm.get(temp) +" No of duplicate character");

			}
		}
	}

}
