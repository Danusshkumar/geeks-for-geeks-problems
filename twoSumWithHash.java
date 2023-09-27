// problem stmt : https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-Hashing/problem/hashing-for-pair-1

class Geeks {
    public static int sumExists(int arr[], int N, int sum) {
        
        HashSet<Integer> s = new HashSet<>();
        
        for(int i : arr){
            if(s.contains(sum-i))
                return 1;
            else
                s.add(i);
        }
        return 0;
    }
}
