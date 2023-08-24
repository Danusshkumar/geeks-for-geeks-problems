/*

Problem statement:
Non-Repeating Element

Find the first non-repeating element in a given array arr of N integers.
Note: Array consists of only positive and negative integers and not zero.

Explanation:
First I added all the values into set and all the duplicates into duplicates.
Then I removed the duplicates from the set and now, it contains distinct elements only.

Looping through the array, now we can get the first appearing distinct (non-repeating) element. We can return the element once it's found
Further non-repeating elements (distinct elements) won't be taken into the account.
There will be atleast one non-repeating element and returning -1 is to avoid return type error.

*/

class Check{
    
    public int firstNonRepeating(int arr[], int n) 
    { 
        HashSet<Integer> set = new HashSet<Integer>();
        HashSet<Integer> duplicates = new HashSet<Integer>();
        for(int i : arr)
            if(set.contains(i))
                duplicates.add(i);
            else
                set.add(i);
        
        for(Integer i : duplicates)
            set.remove(i);
        // now set contains non-repeating (distinct elements)
        
        
        for(int i : arr)
            if(set.contains(i))
                return i;
        
        return -1;
    }  
    
}
