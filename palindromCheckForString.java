/*

Problem stmt : https://practice.geeksforgeeks.org/problems/palindrome-string0817/1

*/
class Solution {
    int isPalindrome(String s) {
        int low = 0, high = s.length() - 1;
        while(low < high){
            if(s.charAt(low) != s.charAt(high))
                return 0;
            low++;
            high--;
        }
        return 1;
    }
};
