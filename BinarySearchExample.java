package xyz;

public class BinarySearchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,3,4,5,6,7,8,9};
		int n=nums.length;
		int start=0;
		int end=n-1;
		
		int target=51;
		boolean found=false;
		while(start<=end) {
			int mid=(start+end)/2;
			if(nums[mid]==target) {
				System.out.println("found");
				found=true;
				break;
			}else if(nums[mid]<target) {
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
         if(!found) {
        	 System.out.println("not found");
         }
	}

}
