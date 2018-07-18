//思路 把非零的往前移动  后面的补0
class Solution {
    public void moveZeroes(int[] nums) {
        int cur = 0;   
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0 ){
                nums[cur] = nums[i];
                cur++;
            }
        }
        for (; cur < nums.length; cur++) {
            nums[cur]=0;
        }

    }
}