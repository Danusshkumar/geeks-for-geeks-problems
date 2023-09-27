// problem stmt : https://practice.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1

class Solution
{
    ArrayList<Integer> countDistinct(int arr[], int n, int k){
        
        if(k > n){
            
        }
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0;i<k;i++)
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        
        ArrayList<Integer> res = new ArrayList<>();
        res.add(map.size());
        
        for(int i = k;i<n;i++){
            
            if(map.get(arr[i-k]) == 1){ //i-k is the element that we are gonna remove
                map.remove(arr[i-k]);
            }
            else {
                map.put(arr[i-k],map.get(arr[i-k])-1);
            }
            
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            //i is the element that we are gonna add
            res.add(map.size());
        }
        
        return res;
    }
}

