package lab2;

import java.awt.Color;

import lab2.level.Level;
import lab2.level.LevelGUI;
import lab2.level.Room;

public class Driver {
	
	Level level1 = new Level();

	public void run() {
		System.out.println("This is a print-out from the driver");
		
		
		Room first = new Room(80,200,Color.red);
		Room second = new Room(180,180,Color.ORANGE);
		Room third = new Room(200,80,Color.blue);
		Room forth = new Room(80,100,Color.GREEN);
		Room fifth = new Room(60,80,Color.PINK);
		Room sixth = new Room(120,80,Color.YELLOW);
		Room seventh = new Room(140,160,Color.MAGENTA);
		Room eighth = new Room(180,80,Color.CYAN);
		
		Level.place(first, 60, 180);
		Level.place(second, 200, 100);
		Level.place(third, 200, 340);
		Level.place(forth, 440, 160);
		Level.place(fifth, 580, 120);
		Level.place(sixth, 420, 320);
		Level.place(seventh, 560, 260);
		Level.place(eighth, 600, 480);
		
		LevelGUI gui = new LevelGUI(level1, "first level");
		
		
		
		
		
		
		

		first.connectEastTo(second);
		second.connectWestTo(first);
		third.connectNorthTo(first);
		first.connectSouthTo(third);
	}

}