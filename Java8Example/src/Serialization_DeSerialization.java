import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable
{
	int i=10;
	//int j=20;
	//trainsent is used only at variable level ,it will save the default value
	//transient int j=20;
	//transient  static int j=20;
	transient  final int j=20;
}


class Serialization_DeSerialization {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		//Serialization example
		Dog d1=new Dog();
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream ops=new ObjectOutputStream(fos);
		ops.writeObject(d1);
		
		//For De-Serialization
		
		
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream (fis);
		Dog d2=(Dog)ois.readObject();
		System.out.println(d2.i +"..."+d2.j);
		

	}

}
