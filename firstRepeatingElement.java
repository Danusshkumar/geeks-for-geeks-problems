/*

Problem statement:
First Repeating Element
Given an array arr[] of size n, find the first repeating element. The element should occur more than once and the index of its first occurrence should be the smallest.
Note:- The position you return should be according to 1-based indexing. 

Explanation : 
Get all the duplicated elements and store it in seperate set.
Now that seperate set contains only duplicated element.
Then loop though the element and search for current element for duplication
in that seperate set and if found then return the index of the current element
+1 as it is the 1-based indexing.

*/

class Solution {
    
    public static int firstRepeated(int[] arr, int n) {
               
        HashSet<Integer> set = new HashSet<Integer>();
        HashSet<Integer> duplicates = new HashSet<Integer>();
        
        for(int i : arr)
            if(set.contains(i))
                duplicates.add(i);
            else
                set.add(i);
            
        for(int i = 0;i<n;i++){
            if(duplicates.contains(arr[i]))
                return i+1;
        }
        
        return -1;
            
        
    }
}
