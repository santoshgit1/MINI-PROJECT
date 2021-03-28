package project;

import java.io.*;
import java.awt.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class Launch3 extends JFrame
{
	JLabel background;
	BufferedImage bk;
//---------------------------------------------------------------------------------
    Launch3()  // CONSTRUCTOR
	{	 	 
		try {
			  bk= ImageIO.read(new File("C:\\Users\\Guest\\eclipse-workspace\\#IMAGES\\Welcome.mp4"));
		    }
	        catch(IOException bk) {}
	
       setSize(700,700); 
	   setLayout(null);
	   setVisible(true);
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	
//---------------------------------------------------------------------------------	
    public void paint (Graphics g)
	{
		super.paint(g);
		g.drawImage(bk, 0, 0, getWidth(), getHeight(), null);
	}	
//---------------------------------------------------------------------------------	


	public static void main(String[] args) 
	{
		new Launch3();
	}

}
