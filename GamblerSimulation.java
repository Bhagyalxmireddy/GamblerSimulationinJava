import java.util.*;
class GamblerSimulation
{
<<<<<<< HEAD
   static int STAKE=100;
   static int BET=1;
   static int Won=0;
   static int Loss=0;
   static int PERCENT=50;
   static int DAYS=20;
   int Result;
   int Winning=0;
   int Lossing=0;
   int WINAMOUNT=0;
   int LOSSAMOUNT=0;
   int WIN=0;
   int LOSS=0; 
   int Amount=0;
   int days;
//   int BettingToss;

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
          
           for(days=1;days<=DAYS;days++)
            {
               STAKE = 100;        
              while( STAKE > Lossing && STAKE < Winning )
               {
                     double BettingToss = Math.floor(Math.random()*10)%2;
                    if( BettingToss == 1)
                    {
                       STAKE=STAKE+BET;
                    }
                     else
                    {
                       STAKE=STAKE-BET;
                     }
               }
                if(STAKE == 150)
                 {
                     WINAMOUNT=WINAMOUNT + STAKE;
                      WIN=WIN+1;
                 }
                else
                {
                    LOSSAMOUNT= STAKE - LOSSAMOUNT;
                    LOSS=LOSS+1;
                }
                 System.out.println("Amount of the day:" +days+ " is " +STAKE);
                Amount=Amount + STAKE;
           }
          System.out.println("total amount used during the game is:" +Amount);
    return Result;
=======
	static final int STAKE = 100;
   	static final int BET = 1;
   	static int Won = 0;
        static int Loss = 0;
        int value;
        int Stake;
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
>>>>>>> c868493126380b3674454910c075286425b5e287
         }


        public static void main(String args[]){
          System.out.println("Welcome to GamblerSimulation");   
            GamblerSimulation played=new GamblerSimulation();
              played.gamblerGame();
        }
}

