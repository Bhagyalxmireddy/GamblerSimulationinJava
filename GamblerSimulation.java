import java.util.*;
class GamblerSimulation
{
	static final int STAKE = 100;
   	static final int BET = 1;
	static final int PERCENT =50;
   	static int Won = 0;
        static int Loss = 0;
        int winning = 0;
        int lossing = 0;
	int value;
        int stake;
        int result;

         public int gamblerGame()
          {
          	int value = STAKE * PERCENT;
           	value = value / 100;
           	winning = STAKE + value;
           	System.out.println("The Winning value is:" +winning);
           	lossing = STAKE - value;
           	System.out.println("The Lossing value is:" +lossing);
          	int bettingToss = (int)Math.floor(Math.random()*10)%2;
            	if(bettingToss == 1)
            	{
                   stake = STAKE + BET;
                   System.out.println(" gamler won and stake value is:" +stake);
            	}
                else
                {
                   stake = STAKE - BET;
            	   System.out.println(" gambler loss and stake value is:" +stake);
            	}
    		return result;
        }
	public static void main(String args[])
	{
        	System.out.println("Welcome to GamblerSimulation");   
            	GamblerSimulation played=new GamblerSimulation();
              	played.gamblerGame();
        }
}
