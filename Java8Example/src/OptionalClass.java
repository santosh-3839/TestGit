import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String [] words=new String [10];
		//String word=words[5].toLowerCase();
		//System.out.println(word);
		
		// to avoid abnormal termination, we can use the Optional class.
		//so program can execute without crashing
		
		String [] words=new String [10];
		words[0]="AB";
		words[1]="CD";
		words[2]="EF";
		words[3]="GH";
		words[4]="IJ";
		words[5]="JK";
		Optional<String> checkNull=Optional.ofNullable(words[6]);
		if(checkNull.isPresent())
		{
			String word=words[5].toLowerCase();
			System.out.println(word);
		}
		
		else
			System.out.println("Word is null");	
		
		}

}//class

//If value is present in the array then isPresent() will return true.
