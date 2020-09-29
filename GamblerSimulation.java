import java.util.*;
class GamblerSimulation
{
   static final int STAKE = 100;
   static final int BET = 1;
   static int Won = 0;
   static int Loss = 0;
   int value;
   int Stake;

   static int DAYS=20;
   int WINAMOUNT=0;
   int LOSSAMOUNT=0;
   int WIN=0;
   int LOSS=0; 
   int Amount=0;
   int days;
   static int STAKE = 100;
   static int BET = 1;
   static final int PERCENT = 50;
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
             int TotalInvestment = STAKE * DAYS;
            System.out.println("TotalInvestment is:" +TotalInvestment);
          
           for(days=1;days<=DAYS;days++)
            { 
                STAKE=100;
               while( STAKE > Lossing && STAKE < Winning )
            {
               STAKE = 100;        
              while( STAKE > Lossing && STAKE < Winning )
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
                     WINAMOUNT=WINAMOUNT + STAKE;
                      WIN=WIN+1;
                 }
                else
                {
                    LOSSAMOUNT=LOSSAMOUNT + STAKE;
                    LOSS=LOSS+1;
                }
                 System.out.println("Amount of the day:" +days+ " is " +STAKE);
                Amount=Amount + STAKE;
           }
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
         }

          System.out.println("Total amount is:" +Amount);

          System.out.println("Total amount used during game is:" +Amount);
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
                System.out.println("Number of Luckiest days of Gambler is:" +WIN);
                System.out.println("Number of UnLuckiest days of Gambler is:" +LOSS);
                if(WIN > LOSS)
                {
                 System.out.println("Gambler Won the Amount let's continue the game");
                }
                else
                {
                 System.out.println("GAmbler lossing the Amount let's Quit the game");
                }

           return value;
        public static void main(String args[]){
          System.out.println("Welcome to GamblerSimulation");
          GamblerSimulation player = new GamblerSimulation();
          player.gamePlayed();
        }

}
