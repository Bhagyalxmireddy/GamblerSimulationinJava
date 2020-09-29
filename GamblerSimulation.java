import java.util.*;
class GamblerSimulation
{
   	static final int STAKE = 100;
   	static final int BET = 1;
   	static int Won = 0;
        static int Loss = 0;
        static int DAYS = 30;
        int value;
        int Stake;
	static int PERCENT = 50;
 	static int DAYS = 30;
        int Result;
        int Winning = 0;
        int Lossing = 0;
        int Win = 0;
        int loss = 0;
	int Amount = 0;
	int days = 0;
         public int gamblerGame()
          {
          	int VALUE=STAKE * PERCENT;
           	VALUE=VALUE / 100;
           	Winning=STAKE + VALUE;
           	System.out.println("The Winning value is:" +Winning);
           	Lossing=STAKE - VALUE;
           	System.out.println("The Lossing value is:" +Lossing);
                int TotalInvestment = STAKE * DAYS;
                System.out.println("TotalInvestment is:" +TotalInvestment);
                for(days=1; days<=DAYS; days++)
                 {
                     while(STAKE > Lossing && STAKE < Winning)
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
                	if(STAKE == 150)
                 	{
                     		winamount = winamount + STAKE;
                     		Win=Win+1;
                 	}
                	else
                	{
                    		lossamount = STAKE - lossamount;
                    		Loss=Loss+1;
                	}
  		               System.out.println("Amount of the day:" +days+ " is " +STAKE);
                		Amount=Amount + STAKE;
           	}
          		System.out.println("total amount used during the game is:" +Amount);
	                System.out.println("Total amount won after a month:" +WINAMOUNT);
          		System.out.println("Total amount loss after a month:" +LOSSAMOUNT);
               		if(TotalInvestment > Amount)
                	{
                   		int AmountLoss=TotalInvestment - Amount;
                   		System.out.println("Amount loss is:" +AmountLoss);
                	}
                	else if(TotalInvestment == Amount)
               		{
                    		System.out.println("No amount was win or loss");
               		}
               		else
               		{
                  		int AmountWon=Amount - TotalInvestment;
                   		System.out.println("Amount won is:" +AmountWon);
               		}


    		return Result;
         }
        public static void main(String args[])
        {
        	System.out.println("Welcome to GamblerSimulation");   
            	GamblerSimulation played = new GamblerSimulation();
              	played.gamblerGame();
        }
 
}


