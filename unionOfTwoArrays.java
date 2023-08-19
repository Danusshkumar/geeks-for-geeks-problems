/*

Problem statement : Union of two arrays

Given two arrays a[] and b[] of size n and m respectively. The task is to find the number of elements in the union between these two arrays.
Union of the two arrays can be defined as the set containing distinct elements from both the arrays. If there are repetitions, 
then only one occurrence of element should be printed in the union.
Note : Elements are not necessarily distinct.

Explanation:
By using the advantage to set features removing duplicates, we are doing this.
Add all the element in a[] in set and add all the element in b[] to set. Duplicates are get automatically removed
Then return the size of the set

*/

class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        Set<Integer> set = new HashSet<Integer>();
        
        for(int i = 0;i<n;i++)
            set.add(a[i]);
        
        for(int i = 0;i<m;i++)
            set.add(b[i]);
        
        return set.size();
    }
}
