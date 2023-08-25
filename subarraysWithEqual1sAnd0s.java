/*

Subarrays with equal 1s and 0s
Given an array containing 0s and 1s. Find the number of subarrays having equal number of 0s and 1s.


Explantion:

The problem is to find the no.of subarray having equal number of 0s and 1s.

Naive:
Generate all possible subarrays and do the count ==> TC:O(N) and SC:O(1)


Optimised: TC:O(N) and SC:O(N)

We are creating an array that consists of prefix difference. (as like as prefix sum)
prefix difference means at an index, it represents the difference between no.of zeros and no.of ones on the subarray from 0th index to current index
i.e ==>
0 0 1 ==> -1 
1 1 0 ==> 1
0 1 0 1 ==> 0
Sign represents whether the which number is high and value represents (otherNumCount - currentNumCount)

With this diff array, we are going to calculate the number of subarrays with equal no of zeros and 1s.

if diff[i] == 0 ==> on subarray found

We also have to find such subarray that presents in middle of this array,

Consider there is -1 (diff[i]) at two place. then no.of zeros and no.of ones between these two places are same. That's why they didn't have any difference in values.
This is the core logic behind solving this problem. We are here implementing it with HashMap where keys are diff_values and values are frequencies (how many times the diff_value occured
in diff_array).

consider there is four -1 found in diff array 

_ _ _ -1 _ _ _ -1 _ _ _ -1 _ _ _ -1 _ _ _  Then subarrays will be
        ________ => 1st -1
                  _______
        _________________ ==> 2nd -1
                           ________
                  _________________
        ___________________________ ==> 3rd -1

There are 6 possible subarrays. That's why we are adding the frequencies to count every time we encounter -1. ==>  1 + 2 + 3 ==> 6
                                    

*/


class Solution
{
    static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int count = 0;
        for(int i : arr){
            sum += (i == 0) ? -1 : 1;
            
            if(sum == 0)
                count++;
                
            if(map.containsKey(sum))
                count += map.get(sum);
            
            map.put(sum, map.getOrDefault(sum,0) + 1);
        }
        
        return count;
    }

}

