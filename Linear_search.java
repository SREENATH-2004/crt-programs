public class Linear_search
{
	public static void main(String[] args) {
		int[] nums={1,20,8,11,9,7,4};
		int target=7;
		int index=-1;
		for(int i=0;i<nums.length;i++){
		    if(target==nums[i]){
		        index=i;
		    }
		}System.out.println("element found at index:"+index);
		if(index==-1){
		    System.out.println("element not found at index");
		}
	}
}