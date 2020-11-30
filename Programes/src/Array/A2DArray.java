package Array;

public class A2DArray {

	public static void main(String[] args) {
		
		int x[][]=new int[3][3];
		
		x[0][0]=5;
		x[0][1]=5;
		x[0][2]=5;
		x[1][0]=5;
		x[1][1]=5;
		x[1][2]=5;
		x[2][0]=5;
		x[2][1]=5;
		x[2][2]=5;
		
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				
			System.out.print(x[i][j]+"\t");
		}}
	}

}
