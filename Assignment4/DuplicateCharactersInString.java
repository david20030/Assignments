public class DuplicateCharactersInString {
	
	public static void main(String[] args) {
		String st = "abbbssdfwef";
		boolean [] arr = new boolean[26];
		st.toLowerCase();		
		for(int i=0;i<st.length();i++) {
			int n = st.charAt(i)-97;
			if(arr[n]==false) {
				arr[n]=true;
			}else {
				System.out.println(st.charAt(i));
			}
		}
	}

}
