
public class Palindrome {

	public static void main(String[] args) {
	   String num = "2552";
		System.out.println(isPalindrome(num));
	}
   public static boolean isPalindrome(String num ) {
	     int s =0 ;
	     int e = num.length()-1;
	     while(e>s) {
	    	 if(num.charAt(s)==num.charAt(e)) {
	    		s++;
	    		e--;
	    	 }else {
	    		 return false;
	    	 }
	     }
	   return true;
   }
}
