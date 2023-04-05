import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "MAAN";
		String str2 = "NAAM";
		
	   isAnagram(str1,str2);
	}
  public static void isAnagram(String str1, String str2) {
	  str1 = str1.toUpperCase();
	    str2 = str2.toUpperCase();
	    
	    char[] st1 = str1.toCharArray();
	    char[] st2 = str2.toCharArray();
	    
	    Arrays.sort(st1);
	    Arrays.sort(st2);
	    System.out.println(Arrays.toString(st1));
	    System.out.println(Arrays.toString(st2));
	    if(st1.length != st2.length) {
	    	System.out.println("Not an Anagram");
	    	return;
	    }
	 //   boolean flag = false;
	    for(int i = 0;i<st1.length;i++) {
	    	if(st1[i] != st2[i]) {
	    	System.out.println("Not an Anagram");
	    	//flag = true;
	    	return;
	    	}
	    }
//	    if(st1.equals(st2)) {
//	    	System.out.println("Anagram");
//	    }else {
//	    	System.out.println("Not an Anagram");
//	    }
	  // if(flag == false )
		   System.out.println("Anagram");
  }
}
