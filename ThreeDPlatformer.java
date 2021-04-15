import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferStrategy;

/************************************************************
3D Platformer
Arrow keys to move, space to jump, mouse to change view
TODO fov class??
*************************************************************/

public class ThreeDPlatformer 
extends JFrame 
implements KeyListener, ActionListener, MouseMotionListener
{
	// Window
	public static final int WINDOW_WIDTH = 2560;		
	public static final int WINDOW_HEIGHT = 1600;		
	public static final Color WINDOW_COLOR = Color.WHITE;
	public static final int TITLE_BAR = 22;
	public static final String TITLE = "3D PLATFORMER BY ANDROMEDA KEPECS";

	// Time delay between image updates
	private static final int DELAY_IN_MILLISEC = 20;

	// main method -- start up window
	public static void main(String args[])
	{
		ThreeDPlatformer window = new ThreeDPlatformer();

		window.addKeyListener(window);
		window.addMouseMotionListener(window);
	}

	public ThreeDPlatformer()
	{
		// Initialize player? add gray plus sign in middle of screen
		// TODO

		// Initialize window
		setTitle(TITLE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setVisible(true);

        createBufferStrategy(10);

        Timer clock = new Timer(DELAY_IN_MILLISEC, this);
        clock.start();
	} 

	// Animation paint buffer
	public void paint(Graphics g)
	{
		BufferStrategy bf = this.getBufferStrategy();
		if (bf == null)
			return;

		Graphics g2 = null;
		try 
		{
			g2 = bf.getDrawGraphics();
			myPaint(g2);
		} 
		finally 
		{
			g2.dispose();
		}
		bf.show();
		Toolkit.getDefaultToolkit().sync();	
	}

	public void myPaint(Graphics g)
	{
		// Clear window
		g.setColor(WINDOW_COLOR);
		g.fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);

		// Draw platforms based on mouse info
		// TODO
	}

	// Move fov based on keyPressed input
	public void actionPerformed(ActionEvent e){}

	public void keyPressed(KeyEvent e){}
	public void keyReleased(KeyEvent e){}
	public void keyTyped(KeyEvent e){}

	public void mouseDragged(MouseEvent e){}
	public void mouseMoved(MouseEvent e){}
}
