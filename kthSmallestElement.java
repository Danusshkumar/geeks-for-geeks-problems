/*

Kth smallest element in array

Explanation: Kth smallest element is found using quickSort (lomuto partition)

*/

class Solution{
    
    public static void swap(int[] arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    public static int partition(int[] arr,int l, int r){
        int pivot = arr[r];
        int i = l - 1;
        for(int j = l;j<r;j++){
            if(arr[j] <= pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,r);
        return (i + 1);
    }
    
    
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        while(l <= r){
            int p = partition(arr,l,r);
            if(p == k - 1){
                return arr[p];
            }
            else if(k - 1 < p){
                r = p - 1;
            }
            else {
                l = p + 1;
            }
        }
        return -1;
    } 
}
