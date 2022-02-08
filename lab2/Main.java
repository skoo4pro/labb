
package lab2;

import java.awt.Color;

import lab2.Driver;
import lab2.level.Room;

public class Main {
	public static void main(String[] args) {
		Driver a = new Driver();
		a.run();
		Room first = new Room(5,5,Color.black);
		first.connectEastTo(first);
		
	}
}
