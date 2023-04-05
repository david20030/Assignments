import java.util.Arrays;

public class MaxOccuringChar {

	public static void main(String[] args) {
		
		String str = new String ("asdfssargssagsaSgsassSs");
		int [] arr = new int [26];
		str = str.toLowerCase();
		for(int i = 0 ;i<str.length();i++) {
			char ch = str.charAt(i);
			int n = ch;
			arr[n-97] = arr[n-97]+1;
		}
		int max = Integer.MIN_VALUE;
		char maxocrchar = 'a';
		 for(int j = 0 ;j<26;j++) {
		  	if(arr[j]>max) {
		  		max=arr[j];
		  		maxocrchar =(char)(97+j);
		  	}
		 }
    System.out.println(maxocrchar);
    System.out.println(max);
	}

}
