import java.util.*;
 class GamblerSimulation {
	static final int STAKE = 100;
   	static final int BET = 1;
	static final int PERCENT = 50;
	static final int DAYS = 20;
 	static int won = 0;
        static int loss = 0;
 	int winamount = 0;
	int lossamount = 0;
	int amount = 0;
	int days = 0;
        int winning = 0;
        int lossing = 0;
	int value;
 	int stake ;
        int result;

         public int gamblerGame()
          {
          	value = STAKE * PERCENT;
           	value = value / 100;
           	winning = STAKE + value;
           	System.out.println("The Winning value is:" +winning);
           	lossing = STAKE - value;
           	System.out.println("The Lossing value is:" +lossing);
		int totalInvestment = STAKE * DAYS;
                System.out.println("TotalInvestment is:" +totalInvestment);
                for(days=1; days<=DAYS; days++)
                 {
                     stake = 100;
                 	while(stake > lossing && stake < winning)
			{
		          	int bettingToss = (int)Math.floor(Math.random()*10)%2;
            			if(bettingToss == 1)
            			{
                   			stake = stake + BET;
                   			System.out.println(" gamler won and stake value is:" +stake);
            			}
                		else
                		{
                   			stake = stake - BET;
            	   			System.out.println(" gambler loss and stake value is:" +stake);
            			}
			}
			if(stake == 150)
                        {
                                winamount = winamount + stake;
                               	won = won + 1;
                        }
                        else
                        {
                         	lossamount = stake - lossamount;
                                loss = loss+1;
                        }

			System.out.println("Amount of the day:" +days+ " is " +stake);
			 amount = amount + stake;

		}
		System.out.println("total amount used during the game is:" +amount);
    		return result;
        }
	public static void main(String args[])
	{
        	System.out.println("Welcome to GamblerSimulation");   
            	GamblerSimulation played=new GamblerSimulation();
              	played.gamblerGame();
        }
}

