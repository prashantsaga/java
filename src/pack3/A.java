package pack3;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class A implements Serializable
{
   int i;
   int j;
   int k;
   
   private void writeObject(ObjectOutputStream out) throws IOException
   {   
	   System.out.println("i am in the writeObject");
	   out.writeInt(900);
	  // out.defaultWriteObject();
	   out.writeInt(i);
	   out.writeUTF("test");
   }
   private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
   {   
	   System.out.println("i am in the readObject");
	   System.out.println(in.readInt());
	   //in.defaultReadObject();
	   System.out.println(in.readInt());
	   System.out.println(in.readUTF());
   }
}
