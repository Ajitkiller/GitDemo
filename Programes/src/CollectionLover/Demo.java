package CollectionLover;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Demo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int roll;
	String fname, lname, course;
	int cgpa;
	
	Employee e1=new Employee(1001, "rames", "joshi", "Pgdca", 7.2);
	Employee e2=new Employee(1002, "sudhir", "Sahoo", "Java", 8.5);
	Employee e3=new Employee(1003, "Pankaj", "Jena", "B.tech", 6.3);
	
	LinkedList<Employee> a1=new LinkedList<Employee>();
	a1.add(e1);
	a1.add(e2);
	a1.add(e3);
//	a1.add(e4);
	System.out.println("Your Student information");
	System.out.println("==== ======= ===========");
	
	System.out.println();
	System.out.println("Roll\tEfname\tElname\tCourse\tCGPA");
	System.out.println("===\t======\t======\t======\t====");
	
	Iterator<Employee> i=a1.iterator();
	while (i.hasNext()) {
		Employee e=i.next();
		System.out.println(e.roll+"\t"+e.fname+"\t"+e.lname+"\t"+e.course+"\t"+e.cgpa);
		
	}
	System.out.println();
	System.out.println("Tottal students are :"+a1.size());
}
}
