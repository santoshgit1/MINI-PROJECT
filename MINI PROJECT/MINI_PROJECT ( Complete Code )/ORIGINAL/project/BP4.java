package project;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class BP4 extends JFrame implements ActionListener
{
	BP4() 
	{
	   getContentPane().setBackground(Color.DARK_GRAY);
//-------------------------------------------------------------------------------------	   
	   JLabel l = new JLabel();
	   l.setIcon(new ImageIcon("PROGRAM_IMG\\BP4_LEAPYEAR.PNG"));
	   l.setBounds(10, -15, 800, 800); 
	   getContentPane().add(l);
	
	   setSize(700,800);   // WIDTH, HEIGHT
	   getContentPane().setLayout(null);
	   setVisible(true);
	}	
//---------------------------------------------------------------------------------	
    public void actionPerformed(ActionEvent arg0) {}

    public static void main(String[] args) 
	{
	   new BP4();
	}
	
}