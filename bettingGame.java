/*

Betting game

You are involved in a betting game whose rules are as follows :
a) If you win a round, the bet amount will be added to your current sum and next bet amount will become $1;
b) If you lose a round, the bet amount will be reduced from your current sum and next bet will become twice the previous.
c) game ends either when all the rounds are complete or when you don't have sufficient sum.
Initially, you are given with a string result consisiting of characters from the set {'W', 'L'}, where 'W' indicates a win and 'L' indicates a loss, and initial sum is 4. Initial bet amount for the 1st round will be $1.

You need to find and print the amount at the end of the game (final sum) and in case you do not have enough money in between the game to play the next round, then return -1.

Explanation :

We are writing all the logic as per it's given in the above problem statement.
But we have to get out of the game, if we didn't have enough money to tackle next game. that means if we have rs.4 and next bet is rs.5 means, we will be out and 
we can't say by further winning, I can increase my sum. 

*/


class Solution
{
    static int betBalance(String result)
    {
        int bet = 1, sum = 4;
        int n = result.length();
        for(int i = 0;i<n;i++){
            
            if(sum < bet)
                return -1;
            
            
            if(result.charAt(i) == 'W'){
                sum += bet;
                bet = 1;
            }
            else if(result.charAt(i) == 'L'){

                sum -= bet;
                bet *= 2;
            }
        }
        
        return sum;
    }
}
