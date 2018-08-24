import java.util.Random;
import java.util.Scanner;

public class Runner {
	Random m = new Random(); 
	
	Player p = new Player ("noor", m.nextInt(10), m.nextInt(10));
	GameBoard game = new GameBoard();
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Runner r = new Runner();
		r.game.createTreasureMap(10, 10);
		r.startGame();
		
		
	}
	
	public void startGame() {
		String distance; 
		boolean gameOver = false;
		String direction; 
		Scanner s = new Scanner(System.in);
		while (!gameOver) {
			System.out.println("Which Direction do you want to go to?");
			direction = s.nextLine();
			p.updatePlayerPosition(direction, p);
			distance = game.dailAwnser(p);
			if(distance.substring(0,3).equals("0.0") ) {
				gameOver = true; 
				System.out.println("you have won the game!");
			}else {
				System.out.println(distance);
			}

		}
	}

	
}
