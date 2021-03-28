package project;

import java.io.*;
import java.awt.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Launch2 extends JFrame implements ActionListener
{
	JButton b;
	BufferedImage bk;
	JLabel l, l1, l2, l3, l4, l5, l6, background;
//--------------------------------------------------------------------------------------------------
    Launch2()  // CONSTRUCTOR
	{	 	 
		try {  // FOR BACKGROUND
			  bk= ImageIO.read(new File("IMG\\112.jpg"));
		    }
	        catch(IOException bk) {}
           //----------------------------------------------------------------------  
		    l = new JLabel("PLEASE CLICK 'BUTTON'------"); // FOR LABEL-1
		    Font f = new Font("Italian",Font.BOLD,30);         // SET FONT
		    l.setFont(f);                                      // SET FONT
		    l.setForeground(Color.RED);                        // SET COLOR
		    l.setBounds(80, 8, 800, 50);                       // (x-axis, y-axis, width, length)
		    getContentPane().add(l);
		    
		    l1 = new JLabel("-------> (TO CONTINUE):");         // FOR LABEL-2
		   	l1.setFont(f); 
		   	l1.setForeground(Color.YELLOW);
		   	l1.setBounds(510, 8, 800, 50); 
		   	getContentPane().add(l1);
		  //---------------------------------------------------------------------- 			   
		   	b = new JButton("CLICK HERE");                         // FOR BUTTON
			Font f1 = new Font("Italian",Font.BOLD,30);  
		   	b.setFont(f1);                               
		   	b.setForeground(Color.RED);
		   	b.setBounds(300, 785, 300, 70); 
		   	b.addActionListener(this);
		   	getContentPane().add(b);
		  //---------------------------------------------------------------------- 				   
		   l2 = new JLabel();                     //FOR GIF
		   l2.setIcon(new ImageIcon("IMG\\1.gif"));
		   l2.setBounds(0, 100, 1000, 620);
		   getContentPane().add(l2);
		 //---------------------------------------------------------------------- 			   
		   l3 = new JLabel();                      // FOR SCROLLING
		   l3.setIcon(new ImageIcon("IMG\\an11.gif"));
		   l3.setBounds(53, 785, 800, 70);
		   getContentPane().add(l3);
		 //---------------------------------------------------------------------- 
		   l4 = new JLabel();                      // FOR BACKGROUND OF TITLE
		   l4.setIcon(new ImageIcon("IMG\\an14.gif"));
		   l4.setBounds(0, 15, 900, 40);
		   getContentPane().add(l4);
		   
		   l5 = new JLabel();                     // FOR BACKGROUND OF TITLE
		   l5.setIcon(new ImageIcon("IMG\\an14.gif"));
		   l5.setBounds(400, 15, 900, 40);
		   getContentPane().add(l5);
		 //---------------------------------------------------------------------- 
	   setSize(920,900); 
	   getContentPane().setLayout(null);
	   setVisible(true);
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	
//--------------------------------------------------------------------------------------------------
    public void paint (Graphics g) // FOR BACKGROUND
	{
		super.paint(g);
		g.drawImage(bk, 0, 0, getWidth(), getHeight(), null);
	}	
    
  @Override
  public void actionPerformed(ActionEvent e) 
  {
  	AllinOne all = new AllinOne();
  }
//---------------------------------------------------------------------------------------------------	

	public static void main(String[] args) 
	{
		new Launch2();
	}

}