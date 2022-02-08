
package lab2.level;

import java.util.Observable;
import java.util.ArrayList;
import lab2.level.Room;


public class Level extends Observable {
	
	public ArrayList<Room> rooms = new ArrayList<>();
	int xcord;
	int ycord;
	
	
	public boolean place(Room r,int x,int y)  {
		
		for(Room room : rooms) {
			if(room.x > room.dx && room.y > room.dy && r.x > r.dx && r.y > r.dy) {
				return false;
			}
		}
		
		r.x = x;
		r.y = y;
		
		
		return true;
	}
	
	public void firstLocation(Room r) {
			xcord = rooms.get(0).dx/2;
			ycord = rooms.get(0).dy/2;
	}
	
}
