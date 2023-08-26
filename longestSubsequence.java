/*

Longest consecutive subsequence

Given an array of positive integers. Find the length of the longest sub-sequence such that elements in the subsequence are 
consecutive integers, the consecutive numbers can be in any order.

Explanation:

We are adding all elements to hashset.
Now by iterating through each element
  We will continue to check for subsequence check only if the current element is the start of new subsequenc. We can do that by checking
  existence of previous element to the current element (i - 1). If i - 1 exists, then current element will be the part of any other subsequence so, we will
  not start the subsequence with current element.

  If there is not previous element for current element, then current element will be the starting point for anyother subsequence. Count the subsequence and store that
  subsequence count in variable called currCount.

  Check if the currCount is greater than the count (global count) if it so, then update the global count (count) with currCount or else, don't update it.

  This will take O(N) time complexity (that actually O(2N) bcz, we are looking for prevElement for all currentElement). 
  Ultimately O(2N) is considered as O(N).

*/


class Solution
{   
	static int findLongestConseqSubseq(int arr[], int N){
	    
	    HashSet<Integer> set = new HashSet<>();
	    
	    for(int i : arr)
	        set.add(i);
	        
	   int count = 0;
	   for(Integer i : set){
	       if(!set.contains(i - 1)){
	           
	           int currCount = 1;
	           
	           int next = i + 1;
	           while(set.contains(next)){
	               currCount++;
	               next += 1;
	           }
	           
	           count = (currCount > count) ? currCount : count;
	       }
	   }
	   return count;
	}
}
