/*
Strongest Neighbour

Given an array arr[] of n positive integers. The task is to find the maximum for every adjacent pairs in the array.

Explanation:
We are comparing each adjacent elements in the array and printing the maximum of them. 
It's suggested in the GFG code editor that we have to use StringBuffer for faster output.
Note that don't have to take last element into account as there are not adjacent(adjacent next element) to it.

*/

class StrongestNeighbour{
    
    static void maximumAdjacent(int sizeOfArray, int arr[]){
        

         StringBuffer str=new StringBuffer();
         for(int i=0;i<sizeOfArray-1;i++){
             int maxValue=Math.max(arr[i],arr[i+1]);
             str.append(maxValue);
             str.append(" ");
         }
         System.out.print(str);
        
    }
}

