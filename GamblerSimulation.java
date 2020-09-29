import java.util.*;
class GamblerSimulation
{
   static int DAYS=20;
   int WINAMOUNT=0;
   int LOSSAMOUNT=0;
   int WIN=0;
   int LOSS=0; 
   int Amount=0;
   int days;
   static int STAKE = 100;
   static int BET = 1;
   static int Won = 0;
   static int Loss = 0;
   int value;
   static final int PERCENT = 50;
   int Result;
   int Winning = 0;
   int Lossing = 0;
   int Value ;
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
<<<<<<< HEAD
            { 
                STAKE=100;
               while( STAKE > Lossing && STAKE < Winning )
=======
            {
               STAKE = 100;        
              while( STAKE > Lossing && STAKE < Winning )
>>>>>>> UC4_Totalamountafter20days
               {
                     double BettingToss = Math.floor(Math.random()*10)%2;
                    if( BettingToss == 1)
                    {
                       STAKE=STAKE+BET;
                      System.out.println(" gamler won " +STAKE);

                    }
                     else
                    {
                       STAKE=STAKE-BET;
                       System.out.println(" gamler loss " +STAKE);

                     }
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
//          System.out.println("total amount used during the game is:" +Amount);

return value;   
        }

//    return value;

        public static void main(String args[])
       {
          System.out.println("Welcome to GamblerSimulation");   
            GamblerSimulation played = new GamblerSimulation();
              played.gamblerGame();
        }
  //return value;
}

