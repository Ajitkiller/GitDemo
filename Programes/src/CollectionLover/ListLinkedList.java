package CollectionLover;

import java.util.Iterator;
import java.util.LinkedList;

public class ListLinkedList {

	public static void main(String[] args) {
		
		Employee a1=new Employee(10101, "Rohit", "roy", "Zeero", 7.7);
		
		Employee a2=new Employee(10102, "hites", "Jena", "Zee", 7.6);
		Employee a3=new Employee(10103, "Rama", "sena", "Zeer", 7.5);
		Employee a4=new Employee(10101, "kabir", "niile", "Zeelk", 6.7);
		Employee a5=new Employee(10104, "rahul", "max", "Zehg", 7.7);
		
		LinkedList<Employee> i1=new LinkedList<Employee>();
		i1.add(a1);
		i1.add(a2);
		i1.add(a3);
		i1.add(a4);
		i1.add(a5);
		i1.remove(a3);
		
		Iterator<Employee> i=i1.iterator();
		while (i.hasNext()){
			Employee e=i.next();
			System.out.println(e.roll+"\t"+e.fname+"\t"+e.lname+"\t"+e.course+"\t"+e.cgpa);
			
		}
		
		
		
		
		
		
	}

}
