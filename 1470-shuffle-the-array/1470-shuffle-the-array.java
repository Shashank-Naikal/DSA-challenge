class Solution {
    public int[] shuffle(int[] nums, int n) {
        int a[] = new int[2*n];
        int i=0,j=n,k=0;
        while(i<n){
            a[k++] = nums[i++];
            a[k++] = nums[j++];
        }
        return a;
    }
}