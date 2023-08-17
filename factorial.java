/*

Problem statement : Find the factorial of the number n.

Explanation:
Factorial of a number is multiplication of number 1 to n.
We are doing the same with iterative and recursive approach here. 

*/


import java.util.Scanner;

public class Factorial {

    static int iterativeApproach(int n){
        int temp = 1;
        for(int i = 2;i<=n;i++)
            temp*=i;
        return temp;
    }
/*
 * Time complexity : the loop neglects multiplying 1 as it doesn't make sense and it also neglects multiplying
 * n as it's already there. So the loop will run n-2 times
 * Time complexity is θ(n)
 * Space complexity is θ(1)
 */

    static int recursiveApproach(int n){
        if(n <= 1)
            return 1;
        else
            return n * recursiveApproach(n - 1);
    }

    /*
     * The function will be called n+1 times.So the 
     * time complexity is θ(n).
     * The function call stack reach its maximum height of n+1 at the last function call fun(1).
     * So the space complexity is also θ(n). So the iterative approach is considered as better
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Iterative approach : " + iterativeApproach(n));
        System.out.println("Recursive approach : " + recursiveApproach(n));

    }
}
