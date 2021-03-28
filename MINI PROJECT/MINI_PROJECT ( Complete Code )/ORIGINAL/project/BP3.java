package project;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class BP3 extends JFrame implements ActionListener
{
	BP3() 
	{
	   getContentPane().setBackground(Color.DARK_GRAY);
//-------------------------------------------------------------------------------------	   
	   JLabel l = new JLabel();
	   l.setIcon(new ImageIcon("PROGRAM_IMG\\BP3_EVEN_OR_ODD.PNG"));
	   l.setBounds(10, -60, 800, 800); 
	   getContentPane().add(l);
	
	   setSize(580,710);   // WIDTH, HEIGHT
	   getContentPane().setLayout(null);
	   setVisible(true);
	}	
//---------------------------------------------------------------------------------	
    public void actionPerformed(ActionEvent arg0) {}

    public static void main(String[] args) 
	{
	   new BP3();
	}
	
}