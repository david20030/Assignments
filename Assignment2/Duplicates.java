
public class Duplicates {

	public static void main(String[] args) {
		int [] nums = {2,4,56,3,2,1,5,6,75,4,3,2};
		bubbleSort(nums);
	    duplicates(nums);
	}
	public static void duplicates(int [] nums) {
		System.out.println("duplicates are");
		for(int i=1;i<nums.length;i++) {
			if(nums[i]==nums[i-1]) {
				System.out.print(nums[i] +" ");
			}
		}
	}
	public static void bubbleSort(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j] < arr[j-1]) {
					int temp =arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;	
				}
			}
		}
	}
}
