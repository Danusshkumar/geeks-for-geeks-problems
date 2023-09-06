/*

Problem stmt : Two Repeated Elements

You are given an array of N+2 integer elements. All elements of the array are in the range 1 to N. Also, all elements occur once except two numbers which occur twice. Find the two repeating numbers.

Note: Return the numbers in their order of appearing twice. So, if X and Y are the repeating numbers, and X repeats twice before Y repeating twice, then the order should be (X, Y).

Explanation : self-explanatory with comments

*/
class Solution
{
    //Function to find two repeated elements.
    public int[] twoRepeated(int arr[], int n)
    {
        n += 2; // because the original size of array is n + 2
        boolean[] repeated = new boolean[n]; // creating boolean array
        Arrays.fill(repeated,false);
        
        int[] res = new int[2];
        Arrays.fill(res,-1);
        int j = 0;
        
        
        for(int i = 0;i<n;i++){
            //arr[i] ==> 1 to n (arr[i] - 1) is for position matching arr[i] ==> 1 to n but boolean
            // array 0 to n - 1
            if(repeated[arr[i] - 1] == false) 
            // if element not encountered, then mark as encountered
            // in boolean array
                repeated[arr[i] - 1] = true;
            else if(repeated[arr[i] - 1] == true){ 
                // if already encountered, then add it to res array
                res[j] = arr[i];
                j++;
            }
                
        }
        
        return res;
        
        
    }
    
}
