package project;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class BP7 extends JFrame implements ActionListener
{
	
	BP7() 
	{
	   getContentPane().setBackground(Color.DARK_GRAY);
//----------------------------------------------------------------------------------   
	   JLabel l = new JLabel();
	   l.setIcon(new ImageIcon("PROGRAM_IMG\\BP7_FIBONACCI.PNG"));
	   l.setBounds(10, -65, 800, 800); 
	   getContentPane().add(l);
	
	   setSize(640,680);   // WIDTH, HEIGHT
	   getContentPane().setLayout(null);
	   setVisible(true);
	}	
//---------------------------------------------------------------------------------	
    public void actionPerformed(ActionEvent arg0) {}

    public static void main(String[] args) 
	{
	   new BP7();
	}
	
}