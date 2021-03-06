
public class Player {
	private String name; 
	private String status;
	private int x; 
	private int y; 

	public Player(String name, int x, int y, String status) {
		this.name = name; 
		this.x = x;
		this.y = y; 
		this.status = status; 
	}
	
	public void updatePlayerPosition(String d, Player p)
	{
		
		switch(d.substring(0, 1)){
		case "n" :
			System.out.println("north");
			p.setY(p.getY()+1);
			break;
		case "s":
			System.out.println("south");
			p.setY(p.getY()-1); 
			break;
		case "e":
			System.out.println("east");
			p.setX(p.getX()+ 1); 
			break;
		case "w":
			System.out.println("west");
			p.setX(p.getX()-1); 
			break;
		default :
			System.out.println("Correct Value not written");
			break;	
		}
	}	
	
	
	
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	

}
