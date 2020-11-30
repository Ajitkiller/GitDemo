package CollectionLover;

import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class ListStack {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Stack<Integer> s1=new Stack<>();
		s1.push(20);
		s1.push(30);
		s1.push(25);
		s1.push(39);
		System.out.println(s1);
		System.out.println();
		System.out.println("Higher no is :"+s1.peek());
		System.out.println();
		System.out.println("Enter no which you want to search");
		int i=sc.nextInt();
		if (s1.search(i)!=-1) {
			System.out.println("Your no is avilable");
			
		}else {
			System.out.println("Your no is not avilable");
			
		}
	System.out.println("All no are : "+s1);
	
	}
	
}
