package project;

import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*; 
import javax.swing.border.*;

public class TLS4 extends JFrame implements ActionListener
{  
    JLabel l1, l2;  
    JTextArea ta;  
    JButton co, pad, text; 
    JScrollPane sp;   // text box
    
   //-----------------------------------------------------------------------   
    TLS4()
    {  
        super(" 'Character and Word' Count Tool:");  
        
        l1   = new JLabel("Total Characters: ");   //FOR LABEL-1
        l2   = new JLabel("Total Words: ");        //FOR LABEL-2
        ta   = new JTextArea(); 
        co   = new JButton("Count"); 
        pad  = new JButton("Pad Color"); 
        text = new JButton("Text Color"); 
        sp = new JScrollPane(ta);
        //----------------------------------------------
		   Font f1 = new Font("Italian",Font.BOLD,20);
		   l1.setFont(f1);
		   l2.setFont(f1);
		   l1.setForeground(Color.BLUE);
		   l2.setForeground(Color.BLUE);
		   
		   Font f2 = new Font("Italian",Font.BOLD,16);
		   co.setFont(f2);
		   pad.setFont(f2);
		   text.setFont(f2);
		   co.setForeground(Color.RED);
		   pad.setForeground(Color.RED);
		   text.setForeground(Color.RED);
        //------------------------------------------------
        l1.setBounds  (20, 11, 210, 36);  //x,y,w,h  
        l2.setBounds  (20, 41, 190, 36);   
        co.setBounds  (20, 393, 115, 56);
        pad.setBounds (189, 393, 115, 56);
        text.setBounds(355, 393, 115, 56);
        sp.setBounds  (20, 80, 450, 300); 
        
        co.addActionListener(this);  
        pad.addActionListener(this);  
        text.addActionListener(this);  
  
        add(l1); add(l2); add(sp); add(co); add(pad); add(text);  
          
        setSize(500,500);  
        setLayout(null);
        setVisible(true);  
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);  
    }  
//-----------------------------------------------------------------------------------------------    
    public void actionPerformed(ActionEvent e)
    {  
        if(e.getSource() == co)
        {  
        	String text=ta.getText();  
        	l1.setText("Total Characters: '"+text.length() + "'");  
        	
        	String words[]=text.split("\\s");  
        	l2.setText("Total Words: '"+words.length + "'"); 
        }
        
        else if(e.getSource() == pad)
        {  
            Color c=JColorChooser.showDialog(this,"Choose Color",Color.BLACK);  
            ta.setBackground(c);  
        }
        
        else if(e.getSource() == text)
        {  
            Color c=JColorChooser.showDialog(this,"Choose Color",Color.BLACK);  
            ta.setForeground(c);  
        }        
    }  
 //-----------------------------------------------------------------------   
    public static void main(String[] args) 
    {  
    	new TLS4();  
    }
    
}
