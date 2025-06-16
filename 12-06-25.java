insertion sorting


public class Main{
	public static void main(String[] args) {
	    int[] nums={10,2,3,4,5,20};
	    for(int i=1;i<nums.length;i++){
	        int key=nums[i];
	        int j=i-1;
	        while(j>=0 && nums[j]>key){
	            nums[j+1]=nums[j];
	            j--;
	        }nums[j+1]=key;
	    }for(int i:nums){
	       System.out.print(i+" ");
	        
	    }
	    
	}
    
}


bubble sorting

class Main {
    public static void main(String[] args) {
        int[] nums = { 64, 25, 12, 22, 11 };
        for (int num : BubbleSortAlgo(nums)) {
            System.out.print(num + " ");
        }

    }

    public static int[] BubbleSortAlgo(int[] nums) {
        boolean swapped;
        for (int i = 0; i < nums.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return nums;
    }
}


how many ways


public class Main{
	public static void main(String[] args) {
	    int n=ways(5);
	    System.out.println(n);
	}public static int ways(int n){
	    if(n==0 || n==1)return 1;
	    return ways(n-2)+ways(n-1);
	}
}
