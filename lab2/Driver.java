package lab2;

import java.awt.Color;

import lab2.level.Level;
import lab2.level.LevelGUI;
import lab2.level.Room;

public class Driver {
	
	Level level1 = new Level();

	public void run() {
		System.out.println("This is a print-out from the driver");
		
		

		Room first = new Room(80,200,new Color(30,160,200));
		Room second = new Room(180,180,new Color(50,250,100));
		Room third = new Room(200,80,new Color(89,9,65));
		Room forth = new Room(80,100,new Color(240,90,180));
		Room fifth = new Room(60,80,new Color(220,20,60));
		Room sixth = new Room(120,80, new Color(0,128,128));
		Room seventh = new Room(140,160, new Color(100,20,250));
		Room eighth = new Room(180,80, new Color(200,1,140));
	


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
		first.connectEastTo(third);
		second.connectWestTo(first);
		second.connectSouthTo(third);
		third.connectNorthTo(second);
		third.connectWestTo(first);
		second.connectEastTo(forth);
		forth.connectWestTo(second);
		forth.connectSouthTo(sixth);
		sixth.connectNorthTo(forth);
		forth.connectEastTo(fifth);
		fifth.connectWestTo(forth);
		fifth.connectSouthTo(seventh);
		seventh.connectNorthTo(fifth);
		seventh.connectSouthTo(eighth);
		eighth.connectNorthTo(seventh);
		
	}

}