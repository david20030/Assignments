import java.util.Arrays;
public class SubArray{
	
	public static void main( String[] args) {
		int []arr = {3,5,7,8,9,0,1};
		int[] subArray = {1,9,5,8};
		System.out.println(isSubArray(arr,subArray));
 	}
	public static boolean isSubArray(int [] arr , int subArray[] ) {
		if(subArray.length==0)
			return true;
		selectionSort(arr);
		selectionSort(subArray);
		int i = 0;
		int j = 0;
	    while(i<subArray.length) {
	    	if(j==arr.length) {
	    		return false;
	    	}
	    	if(subArray[i]==arr[j]) {
	    		i++;
	    		j++;
	    	}else
	    	j++;
	    }
		return true;
	}
	public static void selectionSort(int [] arr) {
	    for(int i=0;i<arr.length;i++) {
	    	int maxInd = 0;
	    	 for(int j=0;j<arr.length-i;j++) {
	 	    	if(arr[j]>arr[maxInd]) {
	 	    		maxInd=j;
	 	    	}
	 	    }
	    	 int temp =arr[arr.length-i-1];
				arr[arr.length-i-1]=arr[maxInd];
				arr[maxInd]=temp;	
	    }
	}

}
