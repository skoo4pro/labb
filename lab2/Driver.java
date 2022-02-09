package lab2;

import java.awt.Color;

import lab2.level.Level;
import lab2.level.LevelGUI;
import lab2.level.Room;

public class Driver {
	
	Level level1 = new Level();

	public void run() {
		System.out.println("This is a print-out from the driver");
		
		
		Room first = new Room(300,100,Color.PINK);
		Room second = new Room(100,100,Color.ORANGE);
		Room third = new Room(100,100,Color.blue);
		Room forth = new Room(100,100,Color.GREEN);
		
		level1.place(first, 0, 0);
		level1.place(second, 500, 0);
		level1.place(third, 0, 500);
		level1.place(forth, 300, 300);
		
		LevelGUI gui = new LevelGUI(level1, "first level");
		
		
		
		
		
		
		

		first.connectEastTo(second);
		second.connectWestTo(first);
		third.connectNorthTo(first);
		first.connectSouthTo(third);
	}

}