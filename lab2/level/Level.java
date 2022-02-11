
package lab2.level;


import java.util.Observable;
import java.util.ArrayList;
import lab2.level.Room;
import lab2.Driver;


public class Level extends Observable {
	
	public static ArrayList<Room> rooms = new ArrayList<Room>();
	
	int xcord;
	int ycord;
    
	
	public static boolean place(Room r,int x,int y)  {
		boolean check = false;
		for(Room room : rooms) {
			if(room.x + room.dx >= x && room.x <= x + r.dx 
			&& room.y + room.dy >= y && room.y <= y + r.dy) {
				
				return check;
			}
		}
		
		r.x = x;
		r.y = y;
		rooms.add(r);
		Room first = r;
		rooms.add(first);
		
		return check;
	}
	
	public void firstLocation(Room r) {
			xcord = rooms.get(0).dx/2;
			ycord = rooms.get(0).dy/2;
	}
	
}
