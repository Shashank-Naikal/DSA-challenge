class Solution {
    public int removeDuplicates(int[] a) {
        // int n=a.length;
        int z=1;
        for(int i=1;i<a.length;i++)
        {
            if(a[i] != a[i-1])
                a[z++]=a[i];
        }
        return z;
    }
}
