/*

problem statement : https://practice.geeksforgeeks.org/problems/non-repeating-character-1587115620/1

*/

class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String s)
    {
        int[] count = new int[26];
        
        for(int i = 0;i<s.length();i++)
            count[s.charAt(i) - 'a']++;
        
        for(int i = 0;i<s.length();i++)
            if(count[s.charAt(i) - 'a'] == 1)
                return s.charAt(i);
                
        return '$';
    }
}
