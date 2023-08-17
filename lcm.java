/*

Problem statement : LCM of two numbers

Explanation :
identity : a * b = lcm(a,b) * gcd(a,b);

Rewriting the identity as lcm(a,b) = (a*b) / gcd(a,b);

Refer gcd.java for finding gcd(a,b);

*/


import java.util.Scanner;

public class LCM {

    public static int myLCM(int a,int b){
        int temp1;
        int i = 1;
        while(true){
            temp1 = i*a;
            for(int j = 1;temp1 >= j*b;j++){
                if(temp1 == j*b)
                return temp1;
            }
            i++;
        }
    }

    public static int naiveLCM(int a,int b){
        int res = Math.max(a,b);
        while(true){
            if(res%a == 0 && res%b == 0)
                return res;
            else
                res++;
        }
    }

    public static int gcdModuloEuclid(int a,int b){
    if(b == 0)
        return a;
    else 
        return gcdModuloEuclid(b, a%b);
}
// gcd(12,15) (initially, it get swapped) gcd(15,12) ==> gcd(12,3) ==> gcd(3,0)

    public static int efficientLCM(int a, int b){
        return (a * b) / gcdModuloEuclid(a,b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println(efficientLCM(a,b));
    }
}
