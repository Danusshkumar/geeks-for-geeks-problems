/*

problem stmt : https://practice.geeksforgeeks.org/problems/anagram-1587115620/1

*/
class Solution
{    
    public static boolean isAnagram(String a,String b)
    {
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        int m = a.length(), n = b.length();
        
        for(int i = 0;i<m;i++)
            count1[a.charAt(i) - 'a']++;
        
        for(int i = 0;i<n;i++)
            count2[b.charAt(i) - 'a']++;
            
        for(int i = 0;i<26;i++)
            if(count1[i] != count2[i])
                return false;
        
        return true;
    }
}
