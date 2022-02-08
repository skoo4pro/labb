package lab2;

import java.awt.Color;

import lab2.level.Level;
import lab2.level.LevelGUI;
import lab2.level.Room;

public class Driver {

	public void run() {
		System.out.println("This is a print-out from the driver");
		
		Room first = new Room(5,5,Color.PINK);
		Room second = new Room(8,3,Color.ORANGE);
		Room third = new Room(10,10,Color.blue);
		
		Level firstlevel = new Level();
		firstlevel.place(first, 0, 0);
		firstlevel.place(second,0, 10);
		LevelGUI gui = new LevelGUI(firstlevel, null);
		
		

		first.connectEastTo(second);
		second.connectWestTo(first);
		third.connectNorthTo(first);
		first.connectSouthTo(third);
	}

}