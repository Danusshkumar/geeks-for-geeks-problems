// problem stmt : https://practice.geeksforgeeks.org/problems/longest-span-with-same-sum-in-two-binary-arrays5142/1


class Solution {
    int longestCommonSum(boolean arr1[], boolean arr2[], int n) {
        
        int[] res = new int[n];
        
        for(int i = 0;i<n;i++){
            if(arr1[i] == true)
                if(arr2[i] == true) 
                    res[i] = 0;
                else 
                    res[i] = 1;
            else 
                if(arr2[i] == true)
                    res[i] = -1;
                else
                    res[i] = 0;
                
        }
        
        //finding longest subarray with zero sum
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int result = 0;
        
        int pSum = 0;
        for(int i = 0;i<n;i++){
            
            pSum += res[i];
            
            if(pSum == 0)
                result = i+1;
                
            if(map.containsKey(pSum)){
                int j = map.get(pSum);
                result = Math.max(result,i - j);
            }
            else {
                map.put(pSum,i);
            }
        }
        
        return result;
    }
}
