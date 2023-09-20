/*

problem stmt : https://practice.geeksforgeeks.org/problems/repeated-character2058/1

*/

class Solution
{
    char firstRep(String s)
    {
        int[] count = new int[26];
        
        for(int i = 0;i<s.length();i++){
            count[s.charAt(i) - 'a']++;
        }
        
        for(int i = 0;i<s.length();i++)
            if(count[s.charAt(i) - 'a'] > 1)
                return s.charAt(i);
        
        return '#';
    }
}
