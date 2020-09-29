import java.util.*;
class GamblerSimulation
{
   static int STAKE = 100;
   static int BET = 1;
   static int Won = 0;
   static int Loss = 0;
   int value;

         public int gamblerGame()
        {
          int BettingToss=(int)Math.floor(Math.random()*10)%2;
            if(BettingToss == 1)
            {
             STAKE=STAKE+BET;
            System.out.println(" gamler won " +STAKE);
            }
            else
            {
             STAKE=STAKE-BET;
            System.out.println(" gambler loss " +STAKE);
            }
    return value;
         }


        public static void main(String args[])
       {
          System.out.println("Welcome to GamblerSimulation");   
            GamblerSimulation played=new GamblerSimulation();
              played.gamblerGame();
        }
}
