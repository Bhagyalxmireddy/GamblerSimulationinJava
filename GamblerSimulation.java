import java.util.*;
class GamblerSimulation
{
   static int STAKE=100;
   static int BET=1;
   static int Won=0;
   static int Loss=0;
   static int PERCENT=50;
   int Result;
   int Winning=0;
   int Lossing=0;

         public int GamblerGame()
        {
          int VALUE=STAKE * PERCENT;
           VALUE=VALUE / 100;
           Winning=STAKE + VALUE;
           System.out.println("The Winning value is:" +Winning);
           Lossing=STAKE - VALUE;
           System.out.println("The Lossing value is:" +Lossing);
          int BettingToss=(int)Math.floor(Math.random()*10)%2;
            if(BettingToss == 1)
            {
             STAKE=STAKE+BET;
            }
            else
            {
             STAKE=STAKE-BET;
            }
    return Result;
         }


        public static void main(String args[])
       {
          System.out.println("Welcome to GamblerSimulation");   
            GamblerSimulation played=new GamblerSimulation();
              played.GamblerGame();
        }
}
