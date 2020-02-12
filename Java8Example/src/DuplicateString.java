import java.util.HashMap;
import java.util.Iterator;

public class DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		duplicateString("i am am from java java class");

	}

	private static void duplicateString(String str) {
		
		HashMap <String,Integer> hm=new 
				HashMap<String,Integer>();
		
		String[] s=str.split(" ");
		
		for(String tempString : s)
		{
			if(hm.get(tempString) !=null)
			{
				hm.put(tempString,hm.get(tempString)+1);
			}
			
			else {
				  hm.put(tempString, 1);
			    }
		}
		 Iterator<String> tempString=hm.keySet().iterator();
		 while(tempString.hasNext())
		 {
			 String temp=tempString.next();
			 
			 if(hm.get(temp)>1)
			 {
				 System.out.println("The Word " + temp + " append "+ hm.get(temp) +" No of duplicate");
			 }
		 }
		 
		 
		
	   
		
	}

}
