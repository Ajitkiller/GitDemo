package Array;

import java.util.Scanner;

public class AddEvenNo {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your no");
		int size=sc.nextInt();
		int no[]=new int[size];
		
		for (int i = 0; i < no.length; i++) {
			no[i]=sc.nextInt();
			
		}
		
		int total=0;
		for (int i : no) {
			System.out.println(i+"\t");
			if (i%2==0) {
				
				total=total+i;
			}
		}
		System.out.println("sum of the even no is :"+total);
	}

}
