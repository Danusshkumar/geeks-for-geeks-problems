/*

Iterating through the array and if the given element is equal to current element then increment the count.
Note : count is initially set to 0 and after O(n) iteration count value is returned

*/

class Solution{
    int findFrequency(int arr[], int x){
        int count = 0;
        for(int i = 0;i<arr.length;i++)
            if(arr[i] == x)
                count++;
        
        return count;
    }
}
