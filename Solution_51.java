class Solution {
    public int firstMissingPositive(int[] nums) {

        int i=0;
        while(i<nums.length){
            int val = nums[i]-1;
            if(nums[i] <= nums.length && nums[i] > 0 && nums[i] != nums[val]){
                int temp = nums[i];
                nums[i] = nums[val];
                nums[val] = temp;
            }
            else{
                i++;
            }
        }
        int count =0;

        for(int j=0;j<nums.length;j++){
            if(nums[j] != j+1){
                return j+1;
            }
        }
        return nums.length+1;
    }
}