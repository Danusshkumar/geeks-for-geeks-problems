/*

Problem statement : count the number of digits in a number

Explanation:
we will remove the last digit of the number by / 10. 
we will count how many time we divide the number by 10 until it reaches zero.
Then return the count

*/
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int x = sc.nextInt();
        int count = 0;
        while(x > 0){
            x /= 10;
            count++;
        }
        System.out.println(count);
    }
}

//Time complexity:
// Time complexity of this program is θ(d) where d is the number of digits
