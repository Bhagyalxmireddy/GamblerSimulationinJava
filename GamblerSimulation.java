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
        int Result;
        int Winning = 0;
        int Lossing = 0;
        int Win = 0;
        int loss = 0;
	int Amount = 0;
	int days = 0;
	int winamount = 0;
	int lossamount = 0;
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
                   		//System.out.println(" gamler won " +Stake);
            		}
                	else
                	{
                   		Stake = STAKE - BET;
            	   		//System.out.println(" gambler loss " +Stake);
            		}
                     }
                	if(Stake == 150)
                 	{
                     		winamount = winamount + Stake;
                     		Win=Win+1;
                 	}
                	else
                	{
                    		lossamount = Stake - lossamount;
                    		Loss=Loss+1;
                	}
  		               System.out.println("Amount of the day:" +days+ " is " +Stake);
                		Amount=Amount + STAKE;
           	}
          		System.out.println("total amount used during the game is:" +Amount);
	                System.out.println("Total amount won after a month:" +winamount);
          		System.out.println("Total amount loss after a month:" +lossamount);
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
				System.out.println("Number of Luckiest days of Gambler is:" +Win);
				System.out.println("Number of UnLuckiest days of Gambler is:" +Loss);
			if(Win > Loss)
			{ 
				int Continue = 1;
				int Quit = 0;
				System.out.println("Gambler winnning the Amount ");
                              	System.out.println(" Please enter your choice: " );
                               
			}
			else
			{
                           System.out.println("Gambler lossing the amount let's quit the game");
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


