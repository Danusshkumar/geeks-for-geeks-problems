/*

Merge three sorted arrays : https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-Sorting/problem/merge-three-sorted-arrays-1587115620
Given three sorted arrays A, B and C of size N, M and P respectively. The task is to merge them into a single array which must be sorted in increasing order.

Explanation:
using mergesort for sorting three arrays

*/
class Solution
{
    public static void merge(int[] arr,int l,int r){
        int m = l + (r - l)/2;
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] left = new int[n1];
        int[] right = new int[n2];
        
        for(int i = 0;i<n1;i++)
            left[i] = arr[l+i];
            

        for(int i = 0;i<n2;i++)
            right[i] = arr[m+1+i];
        
        
        int i = 0, j = 0,k = l;
        while( i < n1 && j < n2){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }
            else{
                arr[k] = right[j];
                j++;
            }
            k++;
            
        }
        
        while(i < n1){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j < n2){
            arr[k] = right[j];
            j++;
            k++;
        }
        
        
    }
    
    public static void mergeSort(int[] arr,int l,int r){
        int m = l + (r - l)/2;
        if(l < r){
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            merge(arr,l,r);
        }
    }

    static ArrayList<Integer> merge3sorted(int a[], int b[], int c[])
    {
        int n = a.length, m = b.length, p = c.length;
        int len = n+m+p;
        int[] res = new int[len];
        
        for(int i = 0;i<n;i++)
            res[i] = a[i];
        
        for(int i = 0;i<m;i++)
            res[n+i] = b[i];
        
        for(int i = 0;i<p;i++)
            res[n+m+i] = c[i];
    
            
        mergeSort(res,0,len - 1);
        
        
        ArrayList<Integer> returnRes = new ArrayList<>();
        for(int num : res)
            returnRes.add(num);
            
        return returnRes;
        
    }
}
