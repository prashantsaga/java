package pack3;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class B implements Externalizable
{   
	int i;
	int j;
	int k;

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(i);
		out.writeInt(j);
		out.writeInt(k);
		out.writeInt(1000);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		i = in.readInt();
		j = in.readInt();
		k = in.readInt();
		System.out.println(in.readInt());
		
	}

}
