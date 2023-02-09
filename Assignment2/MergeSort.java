import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int [] arr = {4,6,9,2,0,-1,-8,24};
		System.out.println(Arrays.toString(mergeSort(arr)));

	}
	public static int[] mergeSort(int [] nums) {
		if(nums.length==1) {
			return nums;
		}
		
		int mid = nums.length/2;
		int [] arr1 = mergeSort(Arrays.copyOfRange(nums,0,mid));
		int [] arr2 = mergeSort(Arrays.copyOfRange(nums,mid,nums.length));
		
		return merge(arr1,arr2);
	}
	public static int[] merge(int [] arr1,int [] arr2) {
		int [] arr = new int[arr1.length+arr2.length];
		int i=0,j=0,k=0;
		while(i < arr1.length && j <  arr2.length ) {
			if(arr1[i] < arr2[j]) {
				arr[k]=arr1[i];
				i++;
			}else {
				arr[k]=arr2[j];
				j++;
			}
			k++;
		}
		if(i==arr1.length) {
			while(j<arr2.length) {
				arr[k]=arr2[j];
				j++;
				k++;
			}
		}else {
			while(i<arr1.length) {
				arr[k]=arr1[i];
				i++;
				k++;
			}
		}
		
		return arr;
	}
	
}
