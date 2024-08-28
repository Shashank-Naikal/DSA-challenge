class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        
        int left=0, i=0;
        for( i=0;i<n;i++){
            if(i<2 || nums[i] != nums[left-2]){
                nums[left++] = nums[i];
            }
        }
        return left;
    }
}