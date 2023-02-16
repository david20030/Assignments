import java.util.Scanner;

public class Umpire {
     private int guesserNum;
     private int p1Num;
     private int p2Num;
     private int p3Num;
     
     public void takeInp() {
    	Guesser gsr = new Guesser();
    	System.out.println("hi! hey guesser guess the number");
    	guesserNum =gsr.guessNum();
    	
    	Player p1 = new Player();
    	System.out.println("hey player1 guess the number");
    	p1Num = p1.playerGuess();

    	Player p2 = new Player();
    	System.out.println("hey player2 guess the number");
    	p2Num = p2.playerGuess();

    	Player p3 = new Player();
    	System.out.println("hey player3 guess the number");
    	p3Num = p3.playerGuess();
    	
    	
     }
       public void showResult () {
    	  if(p1Num == guesserNum && p2Num == guesserNum && p3Num == guesserNum){
    		System.out.println("congratulation all of you are winner");
    	  }else if(p1Num == guesserNum && p2Num == guesserNum ) {
    		  System.out.println("congratulation player1 and player2 both of you won");
    	  }else if(p1Num == guesserNum && p3Num == guesserNum) {
    		  System.out.println("congratulation  player1 and player3 both of you won");  
    	  }else if(p2Num == guesserNum && p3Num == guesserNum) {
    		  System.out.println("congratulation  player2 and player3 both of you won");
    	  }else if(p1Num == guesserNum) {
    		  System.out.println("congratulation  player1 you won");
    	  }else if(p2Num == guesserNum) {
    		  System.out.println("congratulation player 2 you won");
    	  }else if(p3Num == guesserNum) {
    		  System.out.println("congratulation  player3 you won ");
    	  }else {
    		  System.out.println("ha ha no one won ");
    	  }
      }
}
 class Player{
	 private int playerGuessed;
	 Scanner in = new Scanner(System.in);
	 public int playerGuess() {
		playerGuessed = in.nextInt();
		return playerGuessed;
	}

 }
 class Guesser{
	 private int num;
	 Scanner in = new Scanner(System.in);
	 public int guessNum() {
		num=in.nextInt(); 
		return num;
	 }
	
 }