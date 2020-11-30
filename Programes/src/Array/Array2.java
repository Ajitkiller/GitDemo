package Array;

public class Array2 {

	public static void main(String[] args) {
		
		int mars[]=new int[5];
		mars[0]=10;
		mars[1]=15;
		mars[2]=20;
		mars[3]=25;
		mars[4]=30;
	//way-1	
	/*	for (int i = 0; i < mars.length; i++) {
			System.out.println(mars[i]+"\t");
		}*/
		
		//way-2
	/*	for (int i = 0; i < 5; i++) {
			System.out.println(mars[i]+"\t");
		}*/
		
		//way-3
	/*	for (int i : mars) {
			System.out.println(i+"\t");
		}*/
		
		//way-4
		System.out.println(mars[0]);
	}

}
