package Array;

import java.util.Scanner;

public class CalculateMarks {
	public static void main(String[] args) {
	
	int marks[]=new int[5];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter different marks");
	for (int i = 0; i < marks.length; i++) {
		marks[i]=sc.nextInt();
	}
	for (int i : marks) {
		System.out.print(i+"\t");
	}
	
	int total=0;
	for (int i:marks) {
		total=total+i;
	}
	System.out.println(" \n Total marks are :"+total);
	
	double avg=(double)total/5;
	System.out.println("avrage mark is :"+avg);
	}
}
