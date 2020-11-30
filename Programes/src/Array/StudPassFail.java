package Array;

import java.util.Scanner;

public class StudPassFail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of passed candidates");
		int size=sc.nextInt();
		int htno[]=new int[size];
		System.out.println("Enter htno");
		for (int i = 0; i < htno.length; i++) {
			htno[i]=sc.nextInt();
		}
		
		System.out.println("htno of passed candidates");
		for (int i : htno) {
			System.out.println(i+"\t");
		}
		System.out.println("Enter your htno");
		int ht=sc.nextInt();
		int c=0;
		for (int i : htno) {
			if (i==ht) {
				System.out.println("You are passed");
				break;
			}
			c++;
		}
		if (c==size) {
			System.out.println("congrats you have one more chance");
			System.out.println("thank you");
		}
		
		
		
	}

}
