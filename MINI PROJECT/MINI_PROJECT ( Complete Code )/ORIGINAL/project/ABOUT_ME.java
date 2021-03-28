package project;

import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ABOUT_ME extends JFrame
{
	JButton b;
	JLabel  l1, l2, l3, l4;
	JTextField Wel;
	BufferedImage bk;
//---------------------------------------------------------------------------------------------------
	ABOUT_ME()  // CONSTRUCTOR
	{
    	 getContentPane().setBackground(Color.BLACK);

		   l1 = new JLabel("ABOUT ME:");       //FOR LABEL-1
		   Font f1 = new Font("Italian",Font.BOLD,40);
		   l1.setFont(f1);
		   l1.setForeground(Color.red);
		   l1.setBounds(345, -34, 651, 200);
		   getContentPane().add(l1);
		 //---------------------------------------------------------------------	 		   
		   l2 = new JLabel();                               //FOR ABOUT_ME  
		   l2.setIcon(new ImageIcon("IMG\\abtt.PNG"));
		   l2.setBounds(150, 50, 900, 500);
		   getContentPane().add(l2);
		 //---------------------------------------------------------------------
		   l3 = new JLabel();                               //FOR GIF  
		   l3.setIcon(new ImageIcon("IMG\\aaaa.gif"));
		   l3.setBounds(60, 30, 850, 550);
		   getContentPane().add(l3);
		 //---------------------------------------------------------------------	 		   
		   l4 = new JLabel();                               //FOR BACKGROUND IMAGE   
		   l4.setBackground(Color.BLACK);
		   l4.setIcon(new ImageIcon("IMG\\114.jpg"));
		   l4.setBounds(20, -50, 900, 800);
		   getContentPane().add(l4);	
		 //---------------------------------------------------------------------	 		   
		   
		            
	       setSize(950,650);
	       getContentPane().setLayout(null);
	       setVisible(true);
	}	
//------------------------------------------------------------------------------------------------------------------	
    public void mouseClicked(MouseEvent m) 
    {  
    	Launch2 la = new Launch2(); 
    }
	public void mouseEntered(MouseEvent arg0) {}
	public void mouseExited(MouseEvent arg0) {}
	public void mousePressed(MouseEvent arg0) {}
	public void mouseReleased(MouseEvent arg0) {}
//---------------------------------------------------------------------------------			
    public static void main(String[] args) 
	{
      new ABOUT_ME();
	}
}
