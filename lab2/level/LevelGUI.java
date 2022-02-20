
package lab2.level;
import lab2.Driver;
import lab2.level.Room;
import lab2.level.Level;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class LevelGUI implements Observer {

	private Level lv;
	private Display d;
	private Display lvl;
	Color MyColor = new Color(255,255,230);
	Color MsyColor = new Color(120,30,240);

	
	
	
	public LevelGUI(Level level, String name) {
		
		
		
		this.lv = level;
		
		
		JFrame frame = new JFrame(name);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// TODO: You should change 200 to a value 
		// depending on the size of the level
		d = new Display(lv,800,600);
		
		Driver dirve = new Driver();
		
		frame.getContentPane().add(d);
		frame.pack();
		frame.setLocation(0,0);
		frame.setVisible(true);
	}
	
	
	public void update(Observable arg0, Object arg1) {
		d.repaint();
	}
	
	
	
	private class Display extends JPanel {
		
		
		public Display(Level fp, int x, int y) {
		
			
			addKeyListener(new Listener());
			
			setBackground(MyColor);
			setPreferredSize(new Dimension(x+20,y+20));
			setFocusable(true);
		}
	
		
		
		private void sizeLoc(Graphics g) {
			for(Room room : Level.rooms) {	
				if(Level.check = true ) {
					g.setColor(room.color);
					g.fillRect(room.x, room.y, room.dx, room.dy);
					
				}				
			}
					
		} 
		
		private void Corridors(Graphics g) {
			for(Room room : lv.rooms) {
				g.setColor(Color.black);
				if(room.northdoor != null) {
					int roomx = room.x + room.dx/2;
					int roomy = room.y - 20;
					g.fillRect(roomx, roomy, 20, 20);
				}
				if(room.southdoor != null) {
					int roomx = room.x + room.dx/2;
					int roomy = room.y + room.dy ;
					g.fillRect(roomx, roomy, 20, 20);
				}
				if(room.eastdoor != null) {
					int roomx = room.x + room.dx;
					int roomy = room.y + room.dy/2;
					g.fillRect(roomx, roomy, 20, 20);
				}
				if(room.westdoor != null) {
					int roomx = room.x - 20;
					int roomy = room.y + room.dy/2;
					g.fillRect(roomx, roomy, 20, 20);
				}
				
			}
		}
		
		public void firstroom(Graphics g) {
			g.setColor(Color.PINK);
			int xcord = Level.rooms.get(0).x;
			int ycord = Level.rooms.get(0).y;
			g.fillRect(xcord-2, ycord-2 ,85, 205 );
		}
		
		public void currentlocation(Graphics g) {
			for(Room room: lv.rooms);
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			firstroom(g);
			sizeLoc(g);
			Corridors(g);
			
		}
		
		
		
		
	 	private class Listener implements KeyListener {

	 		
	 		public void keyPressed(KeyEvent arg0) {

	 			
	 		}

	 		public void keyReleased(KeyEvent arg0) {
	 			
	 		}


	 		public void keyTyped(KeyEvent event) {
	 			switch(event.getKeyChar()) {
	 			case 'w':
	 				System.out.println("You pressed the 'w' key");
	 				break;
	 			case 'a':
	 				System.out.println("You pressed the 'a' key");
	 				break;
	 			case 's':
	 				System.out.println("You pressed the 's' key");
	 				break;
	 			case 'd':
	 				System.out.println("You pressed the 'd' key");
	 				break; 			
	 			default:
	 				System.out.println("This key does not help you");
	 				break;
	 			}


	 		

	 			
	 		}
	 	}

	}
	
}
//om det finns en dörr, go w/n/..
//if lv.location.doorE != null
//lv.goNorth
