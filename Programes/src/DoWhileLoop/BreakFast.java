package DoWhileLoop;

import java.util.Scanner;

public class BreakFast {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch, cost=0, q, billamt=0;
		
		char p;
		do {
			System.out.println("1. Idly");
			System.out.println("2. Dosa");
			System.out.println("3. Voda");
			
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			
			switch (ch) {
			case 1: cost=30;
				System.out.println("cost of idly :"+cost);
				break;
			case 2: cost=50;
			System.out.println("cost of idly :"+cost);
			break;
			case 3: cost=10;
			System.out.println("cost of idly :"+cost);
			break;
			
			default:
				System.out.println("item not avilable");
				break;
			}
			
			System.out.println("Enter Quantity");
			 q=sc.nextInt();
			
			billamt=billamt+(cost*q);
			System.out.println("\n Do you want any other item (Yes/No)");
			p=sc.next().charAt(0);
			
		} 
		while (p=='y');
		
		System.out.println("\n bill amount is :"+billamt);
		System.out.println("Thank you");
		
		
	}

}
