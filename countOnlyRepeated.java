/*

Count only Repeated
Given an array arr[] of N positive integers, where elements are consecutive (sorted). Also, there is a single element which is repeating X (any variable) number of times. Now, the task is to find the element which is repeated and number of times it is repeated.
Note: If there's no repeating element, Return {-1,-1}.

Explanation:
Explanation for Optimised approach : 
Here, the array will start from some number and end with one number, the array is sorted and there will be no missing element in array, but duplicates may found.
If found, we have to find whether the duplicate is present in left or right. 

Actual mid is the mid element is there is no duplicate element
If the mid element is equal to actual mid, then there will be no duplicates
If the mid element is smaller than actual mid, then there is duplicates in the left, that's why the element is small
If the mid element is greater than actual mid, then there is duplicates in the right, that's why the element is large.

With this intuitive info, we proceed searching with binary search.

*/


// Solution with Linear time complexity
class Solution
{
    // Pair Class
    static class Pair{
         long x;
         long y;
         
         Pair(long x, long y){
             this.x = x;
             this.y = y;
         }
     }
    //Function to find repeated element and its frequency.
    public static Pair findRepeating(Long arr[],int n)
    {
        
        Pair res = new Pair(-1,-1);
        //finding repeating element
        if(n == 0){
            return res;
        }
        
        Long suspect = arr[0];
        Long freq = 1l;
        
        for(int i = 1;i<n;i++){
            if(Long.compare(arr[i],suspect) == 0){
                freq++;
            }
            else if(Long.compare(arr[i],suspect) != 0){
                //they are not equal
                if(freq > 1){
                    // there is an element that appeared
                    break;
                }
                else {
                    suspect = arr[i];
                }
            }
        }
        
        if(freq > 1){
            res.x = suspect;
            res.y = freq;
        }
        
        return res;
    }  
};


// Solution with O(logN) time complexity



//User function Template for Java

class Solution
{
    // Pair Class
    static class Pair{
         long x;
         long y;
         
         Pair(long x, long y){
             this.x = x;
             this.y = y;
         }
     }
    //Function to find repeated element and its frequency.
    public static Pair findRepeating(Long arr[],int n)
    {
        //Your code here
        int low =0;
        int high = n-1;
        
        while(low <= high){
            int mid = (low+high)/2;
            
            if(arr[mid] >= arr[0]+mid){
                  low =mid+1;
            }else{
                 high = mid-1;
            }
        }
        
        long fre= n-(arr[n-1]-arr[0]);
       // finding frequency as there are arr[0] to arr[n - 1] distinct element
         
         Pair ans = new Pair(-1,-1);
        if(fre == 1){
            
             ans.x = -1l;
             ans.y =-1l;
             return ans;
             
        }
       
        ans.x = arr[low];
        ans.y= fre;
        return ans;
    }  
};
