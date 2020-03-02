import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet1 {

	public static void main(String[] args) {
		
	Set<String>value=new HashSet<String>();	
		
		value.add("Ajit");
		value.add("Jagan");
		value.add("Silu");
		System.out.println("Total no of value:"+"\t"+value.size());
		Iterator<String>it=value.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}

}
