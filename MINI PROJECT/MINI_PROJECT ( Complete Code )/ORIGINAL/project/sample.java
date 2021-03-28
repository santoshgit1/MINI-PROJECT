package project;

import java.io.*;
import java.awt.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class sample extends JFrame
{
	JLabel background;
	JTextField Wel;
	BufferedImage bk;
//--------------------------------------------------------------------------------------
    sample()  // CONSTRUCTOR
	{
    	getContentPane().setBackground(Color.RED);	 	 
		try {
			  bk= ImageIO.read(new File("C:\\Users\\Guest\\eclipse-workspace\\#IMAGES\\114.jpg"));
		    }
	        catch(IOException bk) {}
		   //-------------------------------------------------------------------------------------	
		   JLabel l1 = new JLabel();
		   l1.setText("HEARTY WELCOME TO OUR:");
		   Font f = new Font("Italian",Font.BOLD,30);
		   l1.setFont(f);
		   l1.setForeground(Color.BLACK);
		   l1.setBounds(219, 86, 600, 50);
		   getContentPane().add(l1);
		   //-------------------------------------------------------------------------------------			   
		   JLabel l4 = new JLabel();
		   l4.setIcon(new ImageIcon("C:\\Users\\Guest\\eclipse-workspace\\#IMAGES\\an9.gif"));
		   l4.setBounds(44, 193, 800, 390);
		   getContentPane().add(l4);
//-------------------------------------------------------------------------------------	
		   JLabel l2 = new JLabel();
		   l2.setText("(APPY WORLD)");
		   Font f1 = new Font("Times New Roman",Font.BOLD,40);
		   l2.setFont(f1);
		   l2.setForeground(Color.WHITE);
		   l2 .setBounds(263, 135, 600, 50);
		   getContentPane().add(l2);
//-------------------------------------------------------------------------------------			   
		   JLabel l3 = new JLabel();
		   l3.setIcon(new ImageIcon("C:\\Users\\Guest\\eclipse-workspace\\#IMAGES\\114.jpg"));
		   l3.setBounds(28, 86, 835, 519);
		   getContentPane().add(l3);
		   

	   JProgressBar progressBar = new JProgressBar();
	   progressBar.setBounds(28, 660, 835, 35);
       getContentPane().add(progressBar);
       
	   setSize(910,850); 
	   getContentPane().setLayout(null);
	   setVisible(true);
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	
//---------------------------------------------------------------------------------	
   /* public void paint (Graphics g)
	{
		super.paint(g);
		g.drawImage(bk, 0, 0, getWidth(), getHeight(), null);
	}	*/
//---------------------------------------------------------------------------------	


	public static void main(String[] args) 
	{
		new sample();
	}
}
