package project;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class BP2 extends JFrame implements ActionListener
{
	BP2() 
	{
	   getContentPane().setBackground(Color.DARK_GRAY);
//-------------------------------------------------------------------------------------	   
	   JLabel l = new JLabel();
	   l.setIcon(new ImageIcon("PROGRAM_IMG\\BP2_PRIMENO.PNG"));
	   l.setBounds(0, -60, 1000, 1000); 
	   getContentPane().add(l);
	
	   setSize(810,920);   // WIDTH, HEIGHT
	   getContentPane().setLayout(null);
	   setVisible(true);
	}	
//---------------------------------------------------------------------------------	
    public void actionPerformed(ActionEvent arg0) {}

    public static void main(String[] args) 
	{
	   new BP2();
	}
	
}