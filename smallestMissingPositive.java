class Solution
{
    // Function to find the smallest positive number missing from the array.
    
    /*
    Marking the element as negative without encoding it won't work. 
    Thus we are gonna apply some encoding with the factor technique 
    (storing two numbers in single number) even though there is no 
    neccessity to store two elements. we store the maximum element 
    there and with one factor which is max + 1. We mark the element 
    as negative by having minus sign. After encoding with ((b%n)*n),
    we do take the original values, (a) by %n and if the number is
    negative then continue and if the number is positve then the 
    number is not marked and return the number.
    
    */
    static int missingNumber(int arr[], int n)
    {
      
/*        int j = 0;
        for(int i= 0;i<n;i++){
            
            if(arr[i] <= 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        
        //encoding all elements with max and factor
        
        int max = arr[0];
        for(int i = 0;i<n;i++)
            max = (arr[i] > max) ? arr[i] : max;
        
        int factor = max + 1;
        
        //encoding starts from j (first positive element)
        for(int i = j;i<n;i++){
            int index = Math.abs(arr[i]) - 1;
            if(index < n - j && index >= 0){
                arr[j + index] += (max%factor)*factor;
                arr[j + index] = -1 * arr[j + index];
            }
        }
        
        //decoding and finding first positive missing
        for(int i = j;i<n;i++){
            if(arr[j] > 0)
                return i - j + 1;
        }
        
        return n - j + 1;

        // this approach fails over certain condition
*/

      // Easy to understand. Note that, the searching on hashmap will result in O(N) in worst case
      // and if all the elements are same in the array, the searching on hashmap will be O(N) and our
      // algorithm will become O(N2) as we use hashmap search for our every iteration
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0;i<n;i++){
            if(arr[i] > 0){
                hs.add(arr[i]);
            }
        }
        
        int count = 1;
        while(hs.contains(count))
            count++;
        return count;
        
    }
}
