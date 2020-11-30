package Examples;

public class ReturnType {

	    double payLeave(){
		double salary=30000;
		int leaves=5;
		double payin=salary/30*leaves;
		return payin;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		ReturnType r1=new ReturnType();
		double a=r1.payLeave();
		System.out.println("Leave amount is :"+a);
		
		
		
	}
	
	
	
}
