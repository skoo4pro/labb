

package lab2.level;

import java.awt.Color;


public class Room { 
	
	Room northdoor;
	Room southdoor;
	Room westdoor;
	Room eastdoor;
	Color color;
	int dx;
	int dy;
	int x;
	int y;
	
	public Room(int dx, int dy, Color color) {
		this.dx = dx;
		this.dy = dy;
		this.color = color;

		System.out.println("dx:" +dx + " dy:" + dy + " Color:" + color.toString());
	}

	public void connectNorthTo(Room r) {
		this.northdoor = r;
	}
	public void connectEastTo(Room r) {
		this.eastdoor = r;
	}
	public void connectSouthTo(Room r) {
		this.southdoor = r;
	}
	public void connectWestTo(Room r) {
		this.westdoor = r;
	}
}

