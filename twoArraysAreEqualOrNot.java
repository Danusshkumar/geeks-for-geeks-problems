//  problem stmt : https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-Hashing/problem/check-if-two-arrays-are-equal-or-not3847
class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long a[],long b[],int N)
    {
        HashMap<Long,Integer> map = new HashMap<>();
        
        for(long l : a)
            map.put(l,map.getOrDefault(l,0)+1);
        
        for(long l : b)
                map.put(l,map.getOrDefault(l,0)-1);
        
        for(Map.Entry<Long,Integer> e : map.entrySet())
            if(e.getValue() != 0)
                return false;
        
        return true;
    }
}
