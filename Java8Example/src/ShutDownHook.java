
public class ShutDownHook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runtime.getRuntime().addShutdownHook(new Thread()
				{
			      public void run()
			      {
			    	  System.out.println("Shutdown hook is running");
			      }
				});
		
		System.out.println("Application Terminated");

	}

}
