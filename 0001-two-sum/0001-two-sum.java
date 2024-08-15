class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int a[] = new int[2];

        for(int i=0;i<n;i++){
            int rem = target - nums[i];
            if(map.containsKey(rem)){
                a[0] = i;
                a[1] = map.get(rem);
                break;
            }
            map.put(nums[i], i);
        }
        return a;
    }
}