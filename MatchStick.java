        /*

        Problem statement : 
Two friends, A and B, are playing the game of matchsticks. In this game, a group of N matchsticks is placed on the table.
The players can pick any number of matchsticks from 1 to 4 (both inclusive) during their chance. The player who takes the 
last match stick wins the game. If A starts first, how many matchsticks should he pick on his 1st turn such that he is
guaranteed to win the game or determine if it's impossible for him to win. Return -1 if it's impossible for A to win the 
game, else return the number of matchsticks should he pick on his 1st turn such that he is guaranteed to win.
Note : Consider both A and B play the game optimally.

        
         a group of N matchsticks
         1 to 4 no of matchsticks
         the player who takes the last match stick wins the game
         
         let's take 48 as input
         A takes 3 matchstick
         B can take 1 to 4 matchstick
         
         A - 48 to 45
         B - 45 to 45 - x ( x will be 1 to 4)
         
         the match stick game winning will be determined when the number
          is too low.
          
          If there is six matchstick,
          then I will take only one matchstick from the round meaning that
          no matter the player 2 takes 1 to 4 matchstick, I will get the remaining 
          matchstick so that I will win the match.
          This will be the logic for game. 
          consider the relationship between this 6 and 1 in ( 1 to 4) matchstick.
          totalNumber - firstMatch = 4 + 1
          totalNumber - firstMatch = 5
          
          if the number match stick is 5, then it'll be impossible to win the game. 
          /// This line is a important note for playing the game
          
          then we have to determine what will be the number of 
          matchstick after certain number of turns
          
          let's take 10.
          A takes 4
          so that B will take only one match stick, which says that B will win the match. 


          The above are my observation: 
          But the answer is to maintain N as multiple of 5 (one after 4 which is a maximum range) and also have to be the 
          second person to pick the remaining part (Which person has the multiple of 5 will lose the game).

          If the value is multiple of 5, then we have no change to win the game.
          Else we will make the value as 5 by taking the remaining matchstick and make opponent end up with the multiple of 5.

          For example, N = 12.
          A takes 2, N = 10
          B can take 1 to 4 : if B takes 2 means, A can take 3 making N again multiple of 5, N = 5
          B take ultimately 4, now A takes the last matchstick 1 and win the game, N = 0

          By this, the no. of matchstick I take will be (5 - no.of.matchStick) that opponent takes. 
          
          
        */


class Solution {
    static int matchGame(Long N) {
                
        if(N%5 == 0)
            return -1;
        else {
            Long res =  N % 5;
            int resInt = res.intValue();
            return resInt;
        }
        
    }
};
