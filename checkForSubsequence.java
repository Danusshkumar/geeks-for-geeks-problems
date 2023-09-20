// Link : https://practice.geeksforgeeks.org/problems/check-for-subsequence4930/1
// Note that the problem is subsequence not the substring
class Solution{
    boolean isSubSequence(String s1, String s2){
        
        int m = s1.length(); //substring
        int n = s2.length(); //original string
        
        int i = 0;
        for(int j = 0;j<n;j++){
            if(s2.charAt(j) == s1.charAt(i)){
                i++;
                if(i == m)
                    return true;
            }
        }
        
        return false;
    }
}
