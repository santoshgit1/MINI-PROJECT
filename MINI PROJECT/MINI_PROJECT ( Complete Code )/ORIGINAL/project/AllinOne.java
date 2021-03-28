package project;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class AllinOne extends JFrame implements ActionListener  // MAIN CLASS
{
	JLabel 	l, l1, l2;
	JButton b1, b2, b3, b4; 
	BufferedImage bk;
//----------------------------------------------------------------------------------------------------------------------	
    AllinOne()  // CONSTRUCTOR
	{
    	getContentPane().setBackground(Color.BLUE);	 
 	   
	   b1= new JButton("TOOLS");     // FOR BUTTON- 1
	   b2= new JButton("GAMES");     // FOR BUTTON- 2
	   b3= new JButton("BASIC PROGRAMMES");    // FOR BUTTON- 3
	   b4= new JButton("ABOUT ME");  // FOR BUTTON- 4
	  //-------------------------------------------------------------------------
/*	   b1.setIcon(new ImageIcon("C:\\Users\\Guest\\eclipse-workspace\\#IMAGES\\settings.png"));
	   b2.setIcon(new ImageIcon("C:\\Users\\Guest\\eclipse-workspace\\#IMAGES\\iii.jpeg"));
	   b3.setIcon(new ImageIcon("C:\\Users\\Guest\\eclipse-workspace\\#IMAGES\\i.png"));
*/	   
	   b1.setBounds(56,  80,  175, 118);
	   b2.setBounds(437, 80,  175, 118);
	   b3.setBounds(56,  446, 175, 118);
	   b4.setBounds(437, 446, 175, 118);
	  //-------------------------------------------------------------------------
	   Font f1 = new Font("Italian",Font.BOLD,18); 
	   b1.setFont(f1); 
	   b2.setFont(f1);
	   b4.setFont(f1);
	   Font f2 = new Font("Italian",Font.BOLD,13);
	   b3.setFont(f2);
	   
	   b1.setForeground(Color.RED);
	   b2.setForeground(Color.BLUE);
	   b3.setForeground(Color.BLACK);
	   b4.setForeground(Color.MAGENTA);
	  //-------------------------------------------------------------------------
	   b1.addActionListener(this);
	   b2.addActionListener(this);
	   b3.addActionListener(this);
	   b4.addActionListener(this);
	  //-------------------------------------------------------------------------
	   getContentPane().add(b1);  getContentPane().add(b2);  getContentPane().add(b3);  getContentPane().add(b4);

	  //--------------------------------------------------------------------------	   
	   l = new JLabel("CHOOSE ANY ONE OPTION:");    // FOR LABEL
	   Font f = new Font("Italian",Font.BOLD,30);   // SET FONT
	   l.setFont(f);                                // SET FONT
	   l.setForeground(Color.BLACK);                // SET COLOR
	   l.setBounds(130, 20, 800, 50);               // (x-axis, y-axis, width, length)
	   add(l);
	   
	   l1 = new JLabel();                           // FOR GIF
	   l1.setIcon(new ImageIcon("IMG\\AN4.gif"));
	   l1.setBounds(130, 80, 500, 500);
	   getContentPane().add(l1);
	   
	   l2= new JLabel();                            // FOR IMG
	   l2.setIcon(new ImageIcon("IMG\\114.jpg"));
	   l2.setBounds(22, 11, 636, 629);
	   getContentPane().add(l2);
	 //-----------------------------------------------------------------------------
	   setSize(700,700); 
	   setVisible(true);
	   getContentPane().setLayout(null);
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

//-----------------------------------------------------------------------------------------------------------------------
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == b1)
		{ 
			TOOLS p1 = new TOOLS();
		}
		else if(e.getSource() == b2)
		{ 
			GAMES p2 = new GAMES(); 
		}
		else if(e.getSource() == b3)
		{ 
			BASIC_PROGRAMMES p3 = new BASIC_PROGRAMMES(); 
		}
		else if(e.getSource() == b4)
		{ 
			ABOUT_ME p4 = new ABOUT_ME(); 
		}
	}
//-----------------------------------------------------------------------------------------------------------------------	
	public static void main(String[] args)   // MAIN METHOD
	{
       new AllinOne();     /* (OR)  AllinOne s= new AllinOne();  
                                              s.myFrame();   */
	}
}

