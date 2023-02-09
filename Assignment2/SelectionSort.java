
public class SelectionSort {

	public static void main(String[] args) {
	    int [] nums = {4,-1,6,8,3,7,9,0};
        selectionSort(nums);
        for(int i:nums) {
        	System.out.print(i+" ");
        }
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
