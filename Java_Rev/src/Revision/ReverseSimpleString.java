package Revision;

public class ReverseSimpleString {
	
	public static void main (String[] args ) {
		
//		//Normal Way
//		
//		String S1 = "Suraj";
//		String Rev = "";
//		
//		for (int i = S1.length()-1; i>=0 ;i--) {
//			
//			Rev = Rev + S1.charAt(i);
//			
//		}
//		
//		System.out.println(Rev);
//		
//			}

	//Using Stringbuffer
	
	StringBuffer S2 = new StringBuffer("JAVA");
	
	System.out.println(S2.reverse());
	
	}
	
}
