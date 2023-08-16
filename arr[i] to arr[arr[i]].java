/*

Problem statement :
Given an array arr[] of size N where every element is in the range from 0 to n-1. Rearrange the given array 
so that the transformed array arrT[i] becomes arr[arr[i]].
NOTE: arr and arrT are both same variables, representing the array before and after transformation respectively.

In this case, I have to store both arr[i] and arr[arr[i]] in the place and I also have the
technique to get both the value. I won't allowed to use hashmap but I will do one intelligent trick.

Let's take arr[i] as a and arr[arr[i]] as b. Note a and b always be less than N.
I add b*n ==> a + b*n.
If I do /n ==> (a + b*n)/n ==> (a/n + b*n/n) ==> (a/n + b) ==> b (a/n will give decimal values like 0.24234 which will be removed by floor division)
If I do %n ==> (a + b*n)%n ==> (a%n + b*n%n) ==> (a%n + 0) (as b*n is multiple of n) ==> a (as a will be smaller then n)

But we won't save like this, instead
(a + b%n * n). we replace b with b%n as if we do this linearly, then on adding arr[arr[i]] (b) to the value, we have to get (a) from the 
already modified (a + b*n). NOTE: a is the original arr[arr[i]].
Inorder to extract a from (a + b*n) we do modulus.
That's why b is replaced with b%n

*/
class Solution
{
 
    // arr: input array
    // n: size of array
    //Function to rearrange an array so that arr[i] becomes arr[arr[i]]
    //with O(1) extra space.
    static void arrange(long arr[], int n)
    {
        for(int i = 0;i<n;i++)
            arr[i] += (arr[ (int) arr[i]] % n)*n;
        
        for(int i = 0;i<n;i++)
            arr[i] /= n;
        
    }
}
