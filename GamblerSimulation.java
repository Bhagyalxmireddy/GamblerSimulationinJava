import java.util.*;
class GamblerSimulation
{
   static int STAKE=100;
   static int BET=1;
   static int Won=0;
   static int Loss=0;
   int value;

         public int GamblerGame()
        {
          int BettingToss=(int)Math.floor(Math.random()*10)%2;
            if(BettingToss == 1)
            {
             STAKE=STAKE+BET;
            }
            else
            {
             STAKE=STAKE-BET;
            }
    return value;
         }


        public static void main(String args[])
       {
          System.out.println("Welcome to GamblerSimulation");   
            GamblerSimulation played=new GamblerSimulation();
              played.GamblerGame();
        }
}
