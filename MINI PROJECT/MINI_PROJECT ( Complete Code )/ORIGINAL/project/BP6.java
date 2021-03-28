package project;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class BP6 extends JFrame implements ActionListener
{
	BP6() 
	{
	   getContentPane().setBackground(Color.DARK_GRAY);
//-------------------------------------------------------------------------------------	   
	   JLabel l = new JLabel();
	   l.setIcon(new ImageIcon("PROGRAM_IMG\\BP6_VOWEL_COUNT.PNG"));
	   l.setBounds(0, -33, 1000, 800); 
	   getContentPane().add(l);
	
	   setSize(940,760);   // WIDTH, HEIGHT
	   getContentPane().setLayout(null);
	   setVisible(true);
	}	
//---------------------------------------------------------------------------------	
    public void actionPerformed(ActionEvent arg0) {}

    public static void main(String[] args) 
	{
	   new BP6();
	}
	
}