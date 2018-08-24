import java.util.Random;

public class GameBoard {
		 int treasureX; 
		 int treasureY;
	int a; 
	
		public void createTreasureMap(int a , int b) {
			Random m = new Random(); 
			    treasureX = m.nextInt(a);			    
			    treasureY = m.nextInt(b); 
			}		
			
		
		public String dailAwnser(Player p) {
			double dist; 
			
			int x = treasureX - p.getX(); 
			int y = treasureY - p.getY();
			
			double temp = (x*x + y*y);   
			dist = Math.sqrt(temp);
			
			return dist + "m"; 
		}
		
}
