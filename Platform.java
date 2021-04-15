import java.awt.*;
import javax.swing.*;

/*************
Platform class
should i make an array of levels in threedplatformer class and then make an array of platforms in levels class
consider handling fov here
**************/

public class Platform extends JFrame
{
	private double x, y, z;
	private String type;
	private Color color;

	public Platform(int xIn, int yIn, int zIn, String typeIn, Color colorIn)
	{
		x = xIn;
		y = yIn;
		z = zIn;
		type = typeIn;
		color = colorIn;
	}

	// Call in some other class if type == regular platform. etc.
	public void drawPlatform()
	{
		
	}

	// Draw spike
	public void drawSpike()
	{

	}

	// Bouncy platforms
	public void drawBounce()
	{

	}

	// Finish line cube 
	public void drawFinish()
	{

	}

}

