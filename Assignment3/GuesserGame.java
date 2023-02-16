import java.util.Scanner;
public class GuesserGame {

	public static void main(String[] args) {
		Umpire ump = new Umpire();
		 System.out.println("game started");
		 Scanner in =  new Scanner(System.in);
		char ch = 97;
		
		while(ch != 'X' && ch != 'x') {
			ump.takeInp();
			ump.showResult();
			System.out.println("press 'X' or 'x' to quit the game" );
			ch = in.next().trim().charAt(0);
		}
		System.out.println("finish");
	}
}
