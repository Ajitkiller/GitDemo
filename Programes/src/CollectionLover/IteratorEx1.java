package CollectionLover;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorEx1 {

	public static void main(String[] args) {
		
		Employee e1=new Employee(1001, "rames", "joshi", "Pgdca", 7.2);
		Employee e2=new Employee(1002, "sudhir", "Sahoo", "Java", 8.5);
		Employee e3=new Employee(1003, "Pankaj", "Jena", "B.tech", 6.3);
		
		ArrayList<Employee> a1=new ArrayList<Employee>();
		a1.add(e1);
		a1.add(e2);
		a1.add(e3);
		
		System.out.println("Your Student information");
		System.out.println("==== ======= ===========");
		
		System.out.println();
		System.out.println("Roll\tEfname\tElname\tCourse\tCGPA");
		System.out.println("===\t======\t======\t======\t====");
		
	// for forward iteration
		ListIterator<Employee> i=a1.listIterator();
		while (i.hasNext()) {
			Employee e=i.next();
			System.out.println(e.roll+"\t"+e.fname+"\t"+e.lname+"\t"+e.course+"\t"+e.cgpa);
			
		}
		System.out.println();
		// for backward iteration
		while (i.hasPrevious()) {
			Employee e=i.previous();
			System.out.println(e.roll+"\t"+e.fname+"\t"+e.lname+"\t"+e.course+"\t"+e.cgpa);
			
		}
		
	}

}
