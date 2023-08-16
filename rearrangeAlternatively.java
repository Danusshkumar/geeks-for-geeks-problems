/*

Problem statement:
Given a sorted array of positive integers. Your task is to rearrange the array elements alternatively i.e first element should be max value, 
second should be min value, third should be second max, fourth should be second min and so on.
Note: Modify the original array itself. Do it without using any extra space. You do not have to return anything.

We have to store two numbers in single index. 
For this we want a common factor to work with. We took max+1 as our common factor as it doesn't disturb our input. We can 
take any number after maximum as our common factor. 

Other steps are same as the steps we followed in rearrange the array in O(1) auxiliary space.
Refer, arr[i] to arr[arr[i]].java

*/


class Solution{
    
    public static void rearrange(long arr[], int n){
        
        long max = arr[0];
        for(int i = 1;i<n;i++)
            max = (arr[i] > max) ? arr[i] : max;
        
        long factor = max + 1;
        
        int i = 0;
        int j = n - 1;
        for(int k = 0;k < n;k++){
            if(k%2 == 0){
                //even position encoding
                arr[k] = arr[k] + (arr[j] % factor)*factor;
                j--;
            }
            else {
                //odd position encoding
                arr[k] = arr[k] + (arr[i] % factor)*factor;
                i++;
                
            }
        }
        
        for(int k = 0;k<n;k++){
            arr[k] = arr[k]/factor;
        }
        
    }

}
