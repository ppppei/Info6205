package midterm;
/*
 *  Time complexity:Olog(n)
 *  Space complexity:O(n)
 */
public class q4 {
	//The given example returns 5
    public static void main(String[] args) {
        int[] test = {2,4,4,4,6,7,7,7,8,9,9,9};
        System.out.println(getIndex(test, 7));
    }
    
    public static int getIndex(int[] nums, int x){
        return getIndex(nums, x,0, nums.length-1);
    }

    public static int getIndex(int[] nums, int x, int small, int big){
    	int mid = (small + big)/2;
    	
        if(small > big || nums[small] > x || nums[big] < x){
            return -1;
        }
        
        if(nums[small] == x){
            return small;
        }
        
        if(nums[mid] < x){
            return getIndex(nums, x, mid +1, big);
        } else if(nums[mid] > x ){
            return getIndex(nums, x, small, mid -1);
        } else {
            return getIndex(nums ,x ,small, mid);
        }
    }
}