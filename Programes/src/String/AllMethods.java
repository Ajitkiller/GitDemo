package String;

public class AllMethods {

	public static void main(String[] args) {
		
		//String s1="java";
	//	System.out.println(s1);
		
		String s1=new String("java");
		System.out.println(s1);
		String s5="AJIT KUMAR SAHOO";
		String s2="ajit kumar sahoo";
		int len=s2.length();
		System.out.println("including space Length of s2 is :"+len);
		
		char ch=s2.charAt(7);
		System.out.println(ch);
		
		String s3=s1.concat(s2);
		System.out.println(s3);
		
		String s4=s2.replace("ajit", "Mr. Ajit");
		System.out.println(s4);
		
		if (s1.equals(s2)) {
			System.out.println("same");
		}else {
			System.out.println("not same");
		}
		
		if (s5.equalsIgnoreCase(s2)) {
			System.out.println("same ");
		} else {

			System.out.println("not same");
		}
		if (s1.startsWith("j")) {
			System.out.println("done");
		}
		else{
			System.out.println("not done");
		}
		
		if (s1.endsWith("j")) {
			
		System.out.println("done");
		}
		else{
			System.out.println("not done");
		}
		String s6=s2.toLowerCase();
		System.out.println(s6);
		String s7=s6.toUpperCase();
		System.out.println(s7);
		String s8="    ajit kumar sahoo    ";
		System.out.println(s8.trim());
		System.out.println(s8.split(s1));
	}

}
