package CollectionLover;

import java.util.ArrayList;

public class CallEmpCls {

	public static void main(String[] args) {
		Employee e1=new Employee(1001, "rames", "tripathi", "Pgdca", 7.2);
		Employee e2=new Employee(1002, "sudhir", "Sahoo", "Java", 8.5);
		Employee e3=new Employee(1003, "Pankaj", "Jena", "B.tech", 6.3);
		
		ArrayList<Employee> a1=new ArrayList<Employee>();
		a1.add(e1);
		a1.add(e2);
		a1.add(e3);
		
		
		System.out.println(a1);
		
		
		
		
		
	}

}
