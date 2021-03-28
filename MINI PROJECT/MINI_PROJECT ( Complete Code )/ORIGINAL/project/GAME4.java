package project;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class GAME4 extends JFrame 
{
	GAME4()
	{
		    this.setTitle("Snake");
	        this.add(new GAME4_P());
	        this.pack();
	        this.setResizable(false);
	        this.setVisible(true);
	        this.setLocationRelativeTo(null);
	}
	
    public static void main(String[] args)
	{
		new GAME4();
	}

}