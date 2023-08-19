/*

Problem statement : Move all negative elements to end

Given an unsorted array arr[] of size N having both negative and positive integers. 
The task is place all negative element at the end of array without changing the order 
of positive element and negative element.

Explanation : 

We are allowed to use auxiliary space. Now, we will check for positive integer and add it to auxiliary array.
Then check for negative number and add it to auxiliary array.
Then copy the auxiliary array to original array and return the same.
Simple logic

*/


class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        int[] temp = new int[n];
        int j = 0;
        for(int i = 0;i<n;i++){
            if(arr[i] > 0){
                temp[j] = arr[i];
                j++;
            }
        }
        
        for(int i = 0;i<n;i++){
            if(arr[i] < 0){
                temp[j] = arr[i];
                j++;
            }
        }
        
        for(int i = 0;i<n;i++){
            arr[i] = temp[i];
        }
        
    }
    
}
