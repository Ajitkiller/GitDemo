package CollectionLover;

import java.util.ArrayList;
import java.util.Scanner;

public class Sudhir {

	public static void main(String[] args) {   
		//Take a arraylist
		ArrayList<String> a1=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		a1.add("ashok");
		a1.add("ajit");
		a1.add("ashish");
		a1.add("amit");
		a1.add("aswine");
		a1.add("arjit");
		System.out.println("Name of students are :");
		//To see how many students name are in list
		System.out.println(a1);
		System.out.println();
		//Take 2nd arraylist 
		ArrayList<String> a2=new ArrayList<String>();
		Scanner sc1=new Scanner(System.in);
		a2.add("123");
		a2.add("124");
		a2.add("145");
		a2.add("125");
		a2.add("143");
		a2.add("130");
		System.out.println("All students roll no :");
		//To see how many students roll are in list
		System.out.println(a2);
		System.out.println();
		//Enter students name to add
		System.out.println("Enter emp name to add");
		String name=sc.next();
		System.out.println("Enter no to add");
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
	/*	a1.clear();
		System.out.println(a1);
		System.out.println(a1.size());*/
		
		//Enter students roll no. to add
		System.out.println("Enter student roll to add");
		String roll=sc.next();
		System.out.println("Enter index no to add");
		int ind=sc.nextInt();
		a2.add(ind, roll);
		System.out.println(a2);
		System.out.println("Enter student roll to remove");
		String stdrol=sc.next();
		System.out.println(stdrol);
		if (a2.contains(stdrol)) {
			a2.remove(stdrol);
			System.out.println(stdrol+" is removed");
		}
		else {
			System.out.println("sorry that name is not avilable");
		}
		
		System.out.println(a2);
		System.out.println("size of the list is :"+a2.size());
	/*	a2.clear();
		System.out.println(a2);
		System.out.println(a2.size());*/
	}

}
