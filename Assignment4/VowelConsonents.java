//TODO WAP to count the number of consonants, vowels, special characters in a String.
public class VowelConsonents {

	public static void main(String[] args) {
		String str = "COUNT the numbers @";
	    count(str);
	}
	 public static void count(String str) {
		 int vowel=0;
		 int cons = 0 ;
		 int specialchar = 0;
		 str = str.toUpperCase();
	 for(int i = 0 ; i < str.length(); i++) {
		 char ch = str.charAt(i);
		 int n = ch;
		 
		 if((n>=65 && n<=90)) {
			if(n==65 || n ==69 || n ==73 || n == 79 || n==85) {
				vowel +=1;
			}else {
				cons +=1;
			}
		}else if((n>=32 && n<=47) || (n>=58 && n <= 64 ) || (n>=91 && n<=96 )|| (n>=123 && n<= 125)) {
			specialchar +=1;
		}
		 
	 }
	 
		
     System.out.println("The number of Vowels are "+vowel);
     System.out.println("The number of Consonants are "+cons );
     System.out.println("The number of Special characters are "+specialchar);
	 
	 }      
}
	 
