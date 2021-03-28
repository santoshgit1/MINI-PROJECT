package project;

import Calculator.Calculator;   // IMPORTING CALCULATOR PROGRAM FROM OTHER PACKAGE CALLED "Calculator".
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class TOOLS extends JFrame implements ActionListener  // MAIN CLASS
{
	JLabel 	l, l1, l2;
	JButton b, b1, b2, b3, b4; 
	BufferedImage bk;
//----------------------------------------------------------------------------------------------------------------------	
    TOOLS()  // CONSTRUCTOR
	{
       getContentPane().setBackground(Color.BLUE);	 
 	   
	   b1= new JButton("CALCULATOR");       // FOR BUTTON- 1
	   b2= new JButton("AGE FINDER");       // FOR BUTTON- 2
	   b3= new JButton("JAVA QUIZ TOOL");   // FOR BUTTON- 3
	   b4= new JButton("WORD COUNTER");                 // FOR BUTTON- 4
	  //-------------------------------------------------------------------------
/*	   b1.setIcon(new ImageIcon("C:\\Users\\Guest\\eclipse-workspace\\#IMAGES\\settings.png"));
	   b2.setIcon(new ImageIcon("C:\\Users\\Guest\\eclipse-workspace\\#IMAGES\\iii.jpeg"));
	   b3.setIcon(new ImageIcon("C:\\Users\\Guest\\eclipse-workspace\\#IMAGES\\i.png"));
*/	   
	   b1.setBounds(56,  80,  170, 118);
	   b2.setBounds(437, 80,  170, 118);
	   b3.setBounds(56,  446, 170, 118);
	   b4.setBounds(437, 446, 170, 118);
	  //-------------------------------------------------------------------------
	   Font f1 = new Font("Italian",Font.BOLD,16); 
	   b1.setFont(f1); 
	   b2.setFont(f1);
	   b3.setFont(f1);
	   b4.setFont(f1);
	   
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
	   l1.setIcon(new ImageIcon("IMG\\an10.gif"));
	   l1.setBounds(150, 130, 400, 350);
	   getContentPane().add(l1);
	   
	   l2= new JLabel();                            // FOR IMG
	   l2.setIcon(new ImageIcon("IMG\\114.jpg"));
	   l2.setBounds(22, 11, 636, 629);
	   getContentPane().add(l2);
	 //-----------------------------------------------------------------------------
	   setSize(700,700); 
	   getContentPane().setLayout(null);
	   setVisible(true);
	}

//-----------------------------------------------------------------------------------------------------------------------
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == b1)
		{ 
			TLS1 c1 = new TLS1();
		}
		else if(e.getSource() == b2)
		{ 
			TLS2 c2 = new TLS2(); 
		}
		else if(e.getSource() == b3)
		{ 
			TLS3 c3 = new TLS3(""); 
		}
		else if(e.getSource() == b4)
		{ 
			TLS4 c4 = new TLS4(); 
		}
	}
//-----------------------------------------------------------------------------------------------------------------------	
	public static void main(String[] args)   // MAIN METHOD
	{
       new TOOLS();     /* (OR)  TOOLS s= new TOOLS();  
                                              s.myFrame();   */
	}
}

