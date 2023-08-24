/*

Find duplicates in an array

Given an array a of size N which contains elements from 0 to N-1, you need to find all the elements occurring more than once in the given array. 
Return the answer in ascending order. If no such element is found, return list containing [-1]. 
Note: The extra space is only for the array to be returned. Try and perform all operations within the provided array. 

Explanation:
One of the simplest solution I ever seen for this complex problem.
We are adding n to every element instead of changing its sign to negative for the element that current element points
We are using %n to retrieve the original element as we may add n to the same element previously.

If we do traversal and if one element is pointed two times means, 2n will be added and if the element is pointed 3 times means, 
3n will be added and so on. 
So after reducing n from the pointed value and if still be greater than n, then add the element which points the that pointer element.
Here in the case, i is pointing the arr[i].
pointer element ==> i
pointed element ==> arr[i].
Thus more i's pointing to single arr[i]
For example 4,2,5,3,2 ==> here 2 points to arr[2] which is 5 and thus 5 is added with n two times. 
So the element which pointed 5 is 2(pointer element) that means the index of 5 ==> 2 (arr[2] = 5)

*/



class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
     
     ArrayList<Integer> res = new ArrayList<>();
       
        for(int i=0;i<n;i++)
            arr[arr[i]%n]+=n;
        
        for(int i=0;i<n;i++)
            if(arr[i]-n>=n)
                res.add(i);
           
        
        if(res.size()==0)
            res.add(-1);
        
        return res;
    }
}
