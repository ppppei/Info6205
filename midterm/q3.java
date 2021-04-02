package midterm;
/*
 *  Time complexity:O(n)
 *  Space complexity:O(1)
 */
public class q3 {
	public static int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1){
                count++;
                if (count > maxOnes) {
                	maxOnes = count;
                }
            }else{
                count = 0;
            }
        }
        return maxOnes;
    }
	public static void main(String[] args) {
		int[] number = new int[] {1,1,1,1,0,1,1,0,1,1,1};
		int max = findMaxConsecutiveOnes(number);
		System.out.println("The max consecutive for 1 is "+max);
	}
}

