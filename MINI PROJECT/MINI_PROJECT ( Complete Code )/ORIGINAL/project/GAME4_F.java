package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

	public class GAME4_F extends JFrame
	{
		GAME4_F()
		{
	        this.setTitle("Snake");
	        this.add(new GAME4_P());
	        this.pack();
	        this.setResizable(false);
	        this.setVisible(true);
	        this.setLocationRelativeTo(null);
	    }
	}
