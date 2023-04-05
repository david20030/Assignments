
public class DuplicateInString {

	public static void main(String[] args) {
		String str = "available";
		System.out.println(removeDuplicate(str));
		
	}
	public static String removeDuplicate(String st) {
		String newstr = "";
		boolean [] arr = new boolean[26];
		st.toLowerCase();		
		for(int i=0;i<st.length();i++) {
			int n = st.charAt(i)-97;
			if(arr[n]==false) {
				arr[n]=true;
			    newstr = newstr+st.charAt(i);
			}else {
				//System.out.print(st.charAt(i)+ " ");
			}
		}
	
		return newstr;
	}

}
