class Solution {
    public void moveZeroes(int[] nums) {
        int insert_pos=0;

        for (int i=0; i<nums.length ; i++){
            if (nums[i]!=0){
                nums[insert_pos]=nums[i];
                insert_pos ++;
            }
        }

        for(int i=insert_pos; i<nums.length; i++){
            nums[i]=0;
        }
    }
}