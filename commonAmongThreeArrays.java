/*

Problem Statement
Common elements
Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
Note: can you take care of the duplicates without using any additional Data Structure?

Explanation:
We add every element into an hashset thus element search in hashset requires O(1) time complexity.
It also removes duplicates. Thus we add all int array to corresponding hashsets respectively.

For every element in set 1, we have to check the existence of same element in  set2 and set3.
If the element exists, then add that element to result ArrayList

finally sort the res ArrayList and return it
*/


class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        HashSet<Integer> set3 = new HashSet<Integer>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        
        for(int i : A)
            set1.add(i);
        
        for(int i : B)
            set2.add(i);
            
        for(int i : C)
            set3.add(i);
        
        
        for(Integer i : set1)
            if(set2.contains(i) && set3.contains(i))
                res.add(i);
                
        Collections.sort(res);
                
        return res;
        
        
    }
}
