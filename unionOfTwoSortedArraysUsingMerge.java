/*

Union of Two Sorted Arrays : https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-Sorting/problem/union-of-two-sorted-arrays-1587115621
Union of two arrays can be defined as the common and distinct elements in the two arrays.
Given two sorted arrays of size n and m respectively, find their union.

Explanation : 
This solution union the two sorted array using mergeSort function. This also ensures to remove duplicates in the array.
We also have to ensure remove duplicates even after the mergeSort is completed and copying the remaining elements into arrays

*/

class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n1, int n2)
    {
        ArrayList<Integer> res = new ArrayList<>();
        
        int i = 0, j = 0;
        while(i < n1 && j < n2){
            
            if(i > 0 && arr1[i] == arr1[i-1]){
                i++;
                continue;
            }
            
            if(j > 0 && arr2[j] == arr2[j - 1]){
                j++;
                continue;
            }
            
            if(arr1[i] < arr2[j]){
                res.add(arr1[i]);
                i++;
            }
            else if(arr1[i] > arr2[j]){
                res.add(arr2[j]);
                j++;
            }
            else {
                res.add(arr1[i]);
                i++;
                j++;
            }
            
        }
        
        while(i < n1){
            if(i > 0 && arr1[i] == arr1[i-1]){
                i++;
                continue;
            }
            res.add(arr1[i]);
            i++;
        }
        
        while(j < n2){
            if(j > 0 && arr2[j] == arr2[j - 1]){
                j++;
                continue;
            }
            res.add(arr2[j]);
            j++;
        }
        
        return res;
    }
}



