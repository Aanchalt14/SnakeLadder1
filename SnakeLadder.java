//UC-1 Initializing position
public class SnakeLadder {
      static int numberofplayer=1;
      static int position;
      static int diceoutcome=(int)Math.random()*(6-1+1)+1;


      static void start() {
        int position =0;
        System.out.println("Initial position of player is " +position);
      }


     //UC-2 get number between 1-6
      static void rolling_dice() {
      System.out.println( "Dice output :" +diceoutcome);
     }

      //UC-3 checks for an option
      static void play() {
         int number=(int)(Math.random()*(4-1))+1;
         switch (number) {
    	  case 1:
    	  System.out.println("Snake");
    	  position -= diceoutcome;
    	  System.out.println(position);
    	  position--;
    	  break;

    	  case 2:
    	  System.out.println("Ladder" );
    	  position +=diceoutcome;
    	  System.out.println(position);

    	  break;

    	  default :
    	  System.out.println("No play");
        }
 }
    public static void main (String args []) {
        start();
        rolling_dice();
    }
}
