import java.util.*;
class GamblerSimulation
{
	static final int STAKE = 100;
	static final int BET = 1;
	static int Won = 0;
   	static int Loss = 0;
   	int result;
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
    		return result;
         }


        public static void main(String args[]){
          	System.out.println("Welcome to GamblerSimulation");   
            	GamblerSimulation played=new GamblerSimulation();
              	played.gamblerGame();
        }
}
