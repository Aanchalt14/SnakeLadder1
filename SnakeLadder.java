public class SnakeLadder {
	  static int numberofplayer=1;
      static int position; 
      static int diceoutcome=(int)Math.random()*(6-1+1)+1;
	  static int startposition=0;
     //UC-1 initializing starting position
        static void start() {
         int position =0; 
         System.out.println("Initial position of player is " +position);
        }
    
    
    //UC-2 get number between 1-6
     static void rolling_dice() {
     //   int diceoutcome=(int)Math.random()*(6-1+1)+1;
        System.out.println( "Dice output :" +diceoutcome);
    }
    
   
    
    
    static void play() {
    	while(position != 100)
    	{
         int number=(int)(Math.random()*(4-1))+1;  
         switch (number) {
    	  case 1:
    	  System.out.println("Snake");
    	  position -= diceoutcome;
    	  System.out.println(position);
    	  break;
    	
    	  case 2:
    	  System.out.println("Ladder" );
    	  position +=diceoutcome;
    	  System.out.println(position);
       
    	  break;
    	  
    	  default :
    	  System.out.println("No play");
        }
         if (position == 100) {
             break;
         } else if (position > 100) {
             position -= diceoutcome;
             System.out.println("Not valid Dice");
         } else if (position < 0) {
             position = startposition; // Starting from zero again.
             System.out.println(" back to start.");
         } else {
             System.out.println("New Position: " +position);
         }
    	 }
        System.out.println("Winner");
}
   	
    	//main method
     public static void main (String args []) {
       
        start();
        rolling_dice();
        play();
    }
}
