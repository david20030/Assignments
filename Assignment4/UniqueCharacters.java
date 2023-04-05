
public class UniqueCharacters {

	public static void main(String[] args) {
		String str  = "abcdefghijklmnopqrstuvwxyz";
		unique(str);
	}
     public static void unique(String st) {
 		boolean [] arr = new boolean[26];
 		st = st.toLowerCase();		
 		for(int i=0;i<st.length();i++) {
 			int n = st.charAt(i)-97;
 			if(arr[n]==false) {
 				arr[n]=true;
 			}else {
 				System.out.println("not all characters are unique");
 				return;
 			}
 		}
     System.out.println("all characters are unique");
     }
}
