import java.util.*;
class GamblerSimulation
{
	static final int STAKE = 100;
	static final int BET = 1;
	static int won = 0;
   	static int loss = 0;
   	int value;
   	int stake;

         public int gamblerGame()
         {
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
    		return value;
        }
	public static void main(String args[])
	{
        	System.out.println("Welcome to GamblerSimulation");   
            	GamblerSimulation played=new GamblerSimulation();
              	played.gamblerGame();
        }
}
