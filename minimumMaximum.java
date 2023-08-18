//User function Template for Java

/*
 class Pair  
{  
    long first, second;  
    public Pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} */

class Compute 
{
    static Pair getMinMax(long arr[], long n)  
    {
        long min = arr[0];
        long max = arr[0];
        
        for(int i = 0;i<n;i++){
            min = (arr[i] < min) ? arr[i] : min;
            max = (arr[i] > max) ? arr[i] : max;
        }
        
        Pair p = new Pair(min,max);
        return p;
    }
}
