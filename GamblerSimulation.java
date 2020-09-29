import java.util.*;
class GamblerSimulation
{
<<<<<<< HEAD
   static int STAKE = 100;
   static int BET = 1;
   static int Won = 0;
   static int Loss = 0;
   static int PERCENT = 50;
   int Result;
   int Winning = 0;
   int Lossing = 0;

         public int gamblerGame()
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
=======
	static final int STAKE = 100;
	static final int BET = 1;
	static int Won = 0;
   	static int Loss = 0;
   	int value;
   	int Stake;

         public int gamblerGame()
         {
          	int bettingToss = (int)Math.floor(Math.random()*10)%2;
            	if(bettingToss == 1)
            	{
                   Stake = STAKE + BET;
                   System.out.println(" gamler won " +Stake);
            	}
                else
                {
                   Stake = STAKE - BET;
            	   System.out.println(" gambler loss " +Stake);
            	}
    		return value;
>>>>>>> e4a3c638d5cb1c6cd0cde97975f72e7bb020c30d
         }


        public static void main(String args[]){
          System.out.println("Welcome to GamblerSimulation");   
            GamblerSimulation played=new GamblerSimulation();
              played.gamblerGame();
        }
}
