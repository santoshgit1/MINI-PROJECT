package project;

import java.io.*;
import java.awt.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
//---------------------------------------------------------------------------------
public class New extends JFrame
{   
	JLabel l, background;
	JButton b1, b2, b3, b4; 
	BufferedImage bk;
//---------------------------------------------------------------------------------
	New()
	{  
		l = new JLabel();
		l.setText("CHOOSE ANY ONE OPTION:");
		Font f = new Font("Times New Roman",Font.BOLD,30);
		l.setFont(f);
		
		b1 = new JButton("Tools");
		b2 = new JButton("Games");
		b3 = new JButton("Entertainment");
		b4 = new JButton("Others");
		
		l .setBounds(370, 20, 500, 100);
		b1.setBounds(150, 120, 300, 250);
		b2.setBounds(600, 120, 300, 250);
		b3.setBounds(150, 400, 300, 250);		
		b4.setBounds(600, 400, 300, 250);
		
		add(l); add(b1); add(b2); add(b3); add(b4);
		
/*		try {
			  bk= ImageIO.read(new File("C:\\Users\\Guest\\eclipse-workspace\\#IMAGES\\114.jpg"));
		    }
	        catch(IOException bk) {}
*/		
	   setSize(1000,900); 
	   setLayout(null);
	   setVisible(true);
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}		
//---------------------------------------------------------------------------------		
/*	public void paint (Graphics g)
	{
		super.paint(g);
		g.drawImage(bk, 0, 0, getWidth(), getHeight(), null);
	}
*/	
//---------------------------------------------------------------------------------			
	
	public static void main(String[] args) 
	{
       new New();
	}

}
