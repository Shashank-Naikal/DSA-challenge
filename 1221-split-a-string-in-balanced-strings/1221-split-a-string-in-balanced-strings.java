class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int i=0;
        while(i<s.length()){
            int r=0,l=0;
            while(r != l || r==0){
                if(s.charAt(i++) == 'R')             
                    r++;
                else 
                    l++;
            }
            count++;
        }

        return count;
    }
}