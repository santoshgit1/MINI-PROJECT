package project;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class BP1 extends JFrame implements ActionListener
{

	BP1() 
	{
	   getContentPane().setBackground(Color.DARK_GRAY);
//-------------------------------------------------------------------------------------	   
	   JLabel l = new JLabel();
	   l.setIcon(new ImageIcon("PROGRAM_IMG\\BP1_AMSTRONG.PNG"));
	   l.setBounds(10, -20, 900, 700);  
	   getContentPane().add(l);
	
	   setSize(600,700);  // WIDTH, HEIGHT
	   getContentPane().setLayout(null);
	   setVisible(true);
	   
	}	
//---------------------------------------------------------------------------------	
    public void actionPerformed(ActionEvent arg0) {}

    public static void main(String[] args) 
	{
	   new BP1();
	}
	
}
