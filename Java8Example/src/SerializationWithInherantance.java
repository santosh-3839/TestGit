import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A1 implements Serializable
{
	int i;
	public A1(int i) {
	
		this.i=i;
	}
    public A1()
    {}
}//A

class B extends A1
{
	int j;
	
	public B(int i, int j)
	{
		super(i);
		this.j=j;
	}
	
	private void writeObject(ObjectOutputStream out) throws IOException
	{
		throw new NotSerializableException();
	}
	
	private void readObject(ObjectInputStream in) throws IOException
	{
		throw new NotSerializableException();	
	}
}


public class SerializationWithInherantance {

	public static void main(String[] args) throws Exception
	{
		
       B b1=new B(10,20);
       System.out.println("i ="+b1.i);
       System.out.println("J ="+b1.j);
       
       //For serialization 
       FileOutputStream fos=new FileOutputStream("ttt.ser");
       ObjectOutputStream oos=new ObjectOutputStream(fos);
       
       oos.writeObject(b1);
       
       oos.close();
       fos.close();
       
       // For De-serialization
       FileInputStream fis=new FileInputStream("ttt.ser");
       ObjectInputStream oos1=new ObjectInputStream(fis);
       
       B b2=(B)oos1.readObject();
       
       oos1.close();
       fis.close();
       System.out.println("Object has been deserialized");
       System.out.println("i ="+b2.i);
       System.out.println("j ="+b2.j);
       
       
	}

}
