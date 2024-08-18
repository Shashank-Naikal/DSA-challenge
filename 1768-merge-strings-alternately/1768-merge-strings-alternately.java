class Solution {
    public String mergeAlternately(String word1, String word2) {
        String s="";
        int p1=0,p2=0;
        while(p1<word1.length() && p2<word2.length()){
            s+=word1.charAt(p1);
            s+=word2.charAt(p2);
            p1++;p2++;
        }
        while(p1<word1.length()){
            s+=word1.charAt(p1);p1++;
        }
        while(p2<word2.length()){
            s+=word2.charAt(p2);p2++;
        }
        return s;
    }
}