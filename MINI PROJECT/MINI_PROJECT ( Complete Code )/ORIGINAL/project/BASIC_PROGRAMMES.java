package project;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class BASIC_PROGRAMMES extends JFrame implements ActionListener  // MAIN CLASS
{
	JLabel 	l, l1, l2;
	JButton b1, b2, b3, b4, b5, b6, b7; 
	BufferedImage bk;
//----------------------------------------------------------------------------------------------------------------------	
    BASIC_PROGRAMMES()  // CONSTRUCTOR
	{
    	getContentPane().setBackground(Color.RED);	 
 	   
	   b1= new JButton("AMSTRONG");       // FOR BUTTON- 1
	   b2= new JButton("PRIME NUMBER");   // FOR BUTTON- 2
	   b3= new JButton("EVEN OR ODD");    // FOR BUTTON- 3
	   b4= new JButton("LEAP YEAR");      // FOR BUTTON- 4
	   b5= new JButton("PALINDROME");     // FOR BUTTON- 5
	   b6= new JButton("VOWEL COUNT");    // FOR BUTTON- 6
	   b7= new JButton("FIBONACCI");      // FOR BUTTON- 7
	  //-------------------------------------------------------------------------   
	   b1.setBounds(30 , 103, 200, 140);
	   b2.setBounds(340, 103, 200, 140);
	   b3.setBounds(640, 103, 200, 140);
	   b4.setBounds(30 , 560, 200, 140);
	   b5.setBounds(340, 560, 200, 140);
	   b6.setBounds(640, 560, 200, 140);
	   b7.setBounds(285, 300, 300, 190);
	  //-------------------------------------------------------------------------
	   Font f1 = new Font("Italian",Font.BOLD,21); 
	   b1.setFont(f1); 
	   b2.setFont(f1);
	   b3.setFont(f1);
	   b4.setFont(f1);
	   b5.setFont(f1);
	   b6.setFont(f1);
	   Font f2 = new Font("Italian",Font.BOLD,35); 
	   b7.setFont(f2);
	   
	   b1.setForeground(Color.RED);
	   b2.setForeground(Color.BLUE);
	   b3.setForeground(Color.BLACK);
	   b4.setForeground(Color.RED);
	   b5.setForeground(Color.BLUE);
	   b6.setForeground(Color.BLACK);
	   b7.setForeground(Color.MAGENTA);
	  //-------------------------------------------------------------------------
	   b1.addActionListener(this);
	   b2.addActionListener(this);
	   b3.addActionListener(this);
	   b4.addActionListener(this);
	   b5.addActionListener(this);
	   b6.addActionListener(this);
	   b7.addActionListener(this);
	  //-------------------------------------------------------------------------
	   getContentPane().add(b1);  getContentPane().add(b2);  getContentPane().add(b3); 
	   getContentPane().add(b4);  getContentPane().add(b5);  getContentPane().add(b6);
	   getContentPane().add(b7);
	  //---------------------------------------------------------------------------------------------------------------	   
	    l = new JLabel("CHOOSE ANY ONE OPTION:");    // FOR LABEL
	   	Font f = new Font("Italian",Font.BOLD,40);   // SET FONT
	   	l.setFont(f);                                // SET FONT
	   	l.setForeground(Color.BLACK);                // SET COLOR
	   	l.setBounds(150, 40, 800, 50);               // (x-axis, y-axis, width, length)
	   	getContentPane().add(l);
	   
	   l1 = new JLabel();                            // FOR GIF
	   l1.setIcon(new ImageIcon("IMG\\b.gif"));
	   l1.setBounds(235, 100, 800, 600);
	   getContentPane().add(l1);
	    
	   l2= new JLabel();                             // FOR IMAGE
	   l2.setIcon(new ImageIcon("IMG\\114.jpg"));
	   l2.setBounds(22, 11, 831, 725);
	   getContentPane().add(l2);
	 //--------------------------------------------------------------------------------------------------
	   setSize(900,800);  // WIDTH, HEIGHT
	   getContentPane().setLayout(null);
	   setVisible(true);
	}

//-----------------------------------------------------------------------------------------------------------------------
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == b1)
		{ 
			BP1 p1 = new BP1();
		}
		else if(e.getSource() == b2)
		{ 
			BP2 p2 = new BP2(); 
		}
		else if(e.getSource() == b3)
		{ 
			BP3 p3 = new BP3(); 
		}
		else if(e.getSource() == b4)
		{ 
			BP4 p4 = new BP4(); 
		}
		else if(e.getSource() == b5)
		{ 
			BP5 p5 = new BP5(); 
		}
		else if(e.getSource() == b6)
		{ 
			BP6 p6 = new BP6(); 
		}
		else if(e.getSource() == b7)
		{ 
			BP7 p7 = new BP7();
		}	
	}

//-----------------------------------------------------------------------------------------------------------------------	
	public static void main(String[] args)   // MAIN METHOD
	{
       new BASIC_PROGRAMMES();     /* (OR)  BASIC_PROGRAMMES s= new BASIC_PROGRAMMES();  
                                              s.myFrame();   */
	}
}

