/*

Count More than n/k Occurences
Given an array arr[] of size N and an element k. The task is to find all elements in array that appear more than n/k times and return its count

Explanation:
We add all the elements and its frequency to the hashmap and the frequencies that are greater than n/k are counted and the count is returned

*/
class Solution 
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) 
    {
        int occurCount = n/k;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i, map.getOrDefault(i,0) + 1);
        }
        // adding all the elements and its frequency to hashmap
        
        int count = 0;
        for(HashMap.Entry<Integer,Integer> e : map.entrySet()){
            if( e.getValue() > occurCount)
                count++;
        }
        // counting number of elements with the frequencies that are greater than n/k
        
        return count;
    }
}
