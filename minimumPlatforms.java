/*

Minimum Platforms

Given arrival and departure times of all trains that reach a railway station. Find the minimum number of platforms required for
the railway station so that no train is kept waiting.
Consider that all the trains arrive on the same day and leave on the same day. Arrival and departure time can never be the same 
for a train but we can have arrival time of one train equal to departure time of the other. At any given instance of time, same 
platform can not be used for both departure of a train and arrival of another train. In such cases, we need different platforms.


Explanation:
Find the minimum of arrival and maximum of departure time
construct an array from arrival time to departure time.

Mark the interval as +1(increment) when the train is standing there at that time 
return that maximum number of that array

map 0 ==> min and n-1 to max while on processing ==> time[j - min]

*/

class Solution
{

    static int findPlatform(int arr[], int dep[], int n)
    {
        int min = arr[0];
        for(int i : arr)
            min = (i < min ) ? i : min;
        
        int max = dep[n - 1];
        for(int i : dep)
            max = (i > max) ? i : max;
        
        int l = max - min + 1;
        
        int[] time = new int[l];
        Arrays.fill(time,0);
        
        for(int i = 0;i<n;i++){
            for(int j = arr[i];j<=dep[i];j++){
                //index j - min
                time[j - min] += 1;
            }
        }
        
        int res = 0;
        for(int i : time)
            res = (i > res) ? i : res;
            
        return res;
        
    }
    
}

