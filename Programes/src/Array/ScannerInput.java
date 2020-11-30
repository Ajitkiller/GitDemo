package Array;

import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		int marks[]=new int[6];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks");
		
		for (int i = 0; i < marks.length; i++) {
			marks[i]=sc.nextInt();
		}
	//way-1	
		/*for (int i : marks) {
			System.out.print(i+"\t");
		}*/
		
	//way-2
		for (int i = 0; i < marks.length; i++) {
			System.out.print(marks[i]+"\t");
		}
	}

}
