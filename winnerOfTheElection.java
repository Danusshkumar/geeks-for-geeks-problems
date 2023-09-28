// problem stmt : https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-Hashing/problem/winner-of-an-election-where-votes-are-represented-as-candidate-names-1587115621

class Solution {
    public static String[] winner(String arr[], int n) {
        HashMap<String,Integer> map = new HashMap<>();
        
        for(String s : arr)
            map.put(s,map.getOrDefault(s,0)+1);
        
        int max = 0;
        for(Map.Entry<String,Integer> e: map.entrySet())
            max = Math.max(max,e.getValue());
        
        ArrayList<String> ls = new ArrayList<>();
        for(Map.Entry<String,Integer> e:map.entrySet())
            if(e.getValue() == max)
                ls.add(e.getKey());
        
        String[] res = new String[2];
        res[0] = ls.get(0);
        for(String s : ls)
            res[0] = (res[0].compareTo(s) < 0) ? res[0] : s;
        
        res[1] = Integer.toString(max);
            
        return res;
    }
}

