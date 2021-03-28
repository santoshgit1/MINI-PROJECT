package project;

import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Launch1 extends JFrame implements MouseListener
{
	JButton b;
	JLabel  l1, l2, l3, l4, l5, l6, l7, l8, background;
	JTextField Wel;
	BufferedImage bk;
//---------------------------------------------------------------------------------------------------
     Launch1()  // CONSTRUCTOR
	{
    	 getContentPane().setBackground(Color.RED);
     	 addMouseListener(this); 
 /*   	 JLabel l = new JLabel();
    	 ImageIcon icon = new ImageIcon(this.getClass().getResource("/an10.gif"));
    	 l.setIcon(icon);
    	 l.setBounds(0, 0, 910, 850) ;
    	 getContentPane().add(l);
 */   	 
		   l1 = new JLabel("HEARTY WELCOME TO OUR:");       //FOR LABEL-1
		   Font f1 = new Font("Italian",Font.BOLD,30);
		   l1.setFont(f1);
		   l1.setForeground(Color.BLACK);
		   l1.setBounds(235, 30, 651, 59);
		   add(l1);
		  //-------------------------------------------------------------------	   
		   l2 = new JLabel();                               //FOR GIF
		   l2.setIcon(new ImageIcon("IMG\\9.gif"));
		   l2.setBounds(127, 9, 940, 758);
		   add(l2);
		 //---------------------------------------------------------------------	 	
		   l3 = new JLabel("(APPY WORLD)");                 //FOR LABEL-2
		   Font f2 = new Font("Times New Roman",Font.BOLD,40);
		   l3.setFont(f2);
		   l3.setForeground(Color.WHITE);
		   l3 .setBounds(274, 93, 600, 50);
		   add(l3);
		 //---------------------------------------------------------------------	 
		   l4 = new JLabel("By Santo..");                   //FOR LABEL-3
		   Font f3 = new Font("Comic Sans MS",Font.BOLD,15);
		   l4.setFont(f3);
		   l4.setForeground(Color.WHITE);
		   l4 .setBounds(587, 101, 600, 50);
		   add(l4);
		 //---------------------------------------------------------------------	 		   
		   l5 = new JLabel();                               //FOR IMAGE   
		   l5.setIcon(new ImageIcon("IMG\\114.jpg"));
		   l5.setBounds(45, 32, 800, 667);
		   add(l5);
		 //---------------------------------------------------------------------	 
		   l6 = new JLabel();       // FOR ARROW.
		   l6.setIcon(new ImageIcon("IMG\\arr.gif"));
		   l6.setBounds(80, 680, 500, 150);
		   add(l6);
		 //---------------------------------------------------------------------	 
		   l7 = new JLabel();       // FOR ARROW.
		   l7.setIcon(new ImageIcon("IMG\\arr.gif"));
		   l7.setBounds(330, 680, 500, 150);
		   add(l7);
		 //---------------------------------------------------------------------	 
		   l8 = new JLabel();       // FOR ARROW.
		   l8.setIcon(new ImageIcon("IMG\\arr.gif"));
		   l8.setBounds(580, 680, 500, 150);
		   add(l8);
/*		   br= new JProgressBar();
		   br.setForeground(new Color (0, 128, 128) );
		   br.setBounds(44, 660, 800, 35);
		   getContentPane().add(br); 
*/	          
	       setSize(910,850);
	       getContentPane().setLayout(null);
	       setVisible(true);
	       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
      new Launch1();
	}
}
/*
Launch1 la = new Launch1();
la.setVisible(true); 
int i;
try{
	       for ( i=0; i<=100; i++)
	       {
	    	  Launch1.br.setValue(i);
		      Thread.sleep(50); 
		      Launch1.lr.setText(Integer.toString(i));
	       }
   }
   catch(InterruptedException e)
   { 
	 e.printStackTrace();
   }  
*/  
