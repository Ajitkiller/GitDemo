package CollectionLover;

import java.util.ArrayList;
import java.util.Scanner;

public class ListArraylist {

	public static void main(String[] args) {
		
		ArrayList<String> a1=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		a1.add("ashok");
		a1.add("ajit");
		a1.add("ashish");
		a1.add("amit");
		a1.add("aswine");
		a1.add("arjit");
		System.out.println(a1);
		
		System.out.println("Enter emp name to add");
		String name=sc.next();
		System.out.println("Enter index no to add");
		int idn=sc.nextInt();
		a1.add(idn, name);
		System.out.println(a1);
		System.out.println("Enter emp name to remove");
		String enm=sc.next();
		System.out.println(enm);
		if (a1.contains(enm)) {
			a1.remove(enm);
			System.out.println(enm+" is removed");
		}
		else {
			System.out.println("sorry that name is not avilable");
		}
		
		System.out.println(a1);
		System.out.println("size of the list is :"+a1.size());
		a1.clear();
		System.out.println(a1);
		System.out.println(a1.size());
		
		
		System.out.println("Enter emp roll to add");
		String roll=sc.next();
		System.out.println("Enter index no to add");
		int ind=sc.nextInt();
		a2.add(ind, roll);
		System.out.println(a2);
		System.out.println("Enter emp name to remove");
		String enm=sc.next();
		System.out.println(enm);
		if (a1.contains(enm)) {
			a1.remove(enm);
			System.out.println(enm+" is removed");
		}
		else {
			System.out.println("sorry that name is not avilable");
		}
		
		System.out.println(a1);
		System.out.println("size of the list is :"+a1.size());
		a1.clear();
		System.out.println(a1);
		System.out.println(a1.size());
	}

}
