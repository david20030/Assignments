
public class Pangram {

	public static void main(String[] args) {
		String st = "aQuickBrownFoxJumpsOverTheLazyDog";
		boolean [] arr = new boolean[26];
 		st = st.toLowerCase();		
 		for(int i=0;i<st.length();i++) {
 			int n = st.charAt(i)-97;
 			if(arr[n]==false) {
 				arr[n]=true;
 			}
    	}
 		boolean flag = true;
 		for(int i=0;i<26;i++) {
 			if(arr[i]!=true) {
 				System.out.println("not pangram");
 				flag = false;
 				break;
 			}
    	}
 		if(flag)
 			System.out.println("Pangram");
    }
}
