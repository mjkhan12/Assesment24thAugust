import java.util.Random;

public class PoisonPlant {
		int[] x; 
		int[]y;
		Random r = new Random();
		
		
	
		public void setsionPlant(int n, int row , int col , int tx, int ty) {
			x = new int[n];
			y = new int[n];
			for (int i = 0; i < n ; i++) {
				x [i]= r.nextInt(row);
				y [i]= r.nextInt(col);
				if (x[i] == tx && y[i] == ty) {
					x[i] +=1; 
				}
			}			
		}
	
	public void eatPoisionPlant(Player p){
		for (int i = 0 ; i < x.length; i ++) {
			if (x[i] == p.getX() && y[i] == p.getY()) {
			 p.setStatus("dead");
			}
		}
	}
}
