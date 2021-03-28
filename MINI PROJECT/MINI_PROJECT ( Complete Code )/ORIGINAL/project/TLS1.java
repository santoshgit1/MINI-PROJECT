package project;

import java.awt.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel ;
import javax.swing.JTextField;

public class TLS1 implements ActionListener
{
	JFrame f;
	JTextField t;
	JLabel  l1;
	char symbol = '+';
	Font screen1, button;
	double number1 = 0;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9, b0, b00, bdot, bequal, badd, bsub, bdiv, bmul, bbackspace, bclear; 
//---------------------------------------------------------------------------------------------------------------
	
	TLS1()  // OPENING METHOD.
	{
		f = new JFrame("Calculator");
		t = new JTextField();
		//-------------------------------------------------------------------------------------
		l1 = new JLabel ("0");
		b1      = new JButton("1");
		b2      = new JButton("2");
		b3      = new JButton("3");
		b4      = new JButton("4");
		b5      = new JButton("5");
		b6      = new JButton("6");
		b7      = new JButton("7");
		b8      = new JButton("8");
		b9      = new JButton("9");
		b0      = new JButton("0");
		b00     = new JButton("00");
		badd    = new JButton("+");
		bsub    = new JButton("-");
		bmul    = new JButton("*");
		bdiv    = new JButton("/");
		bequal  = new JButton("=");
		bdot    = new JButton(".");
		bclear  = new JButton("C");
		bbackspace  = new JButton("<-");
		//-------------------------------------------------------------------------------------
		screen1 = new Font("Serif",Font.BOLD,45);
		button  = new Font("Arial",Font.PLAIN,25);
		//-------------------------------------------------------------------------------------
		l1.setFont (screen1);
		b1.setFont (button);
		b2.setFont (button);
		b3.setFont (button);
		b4.setFont (button);
		b5.setFont (button);
		b6.setFont (button);
		b7.setFont (button);
		b8.setFont (button);
		b9.setFont (button);
		b0.setFont (button);
		b00.setFont (button);
		bdot.setFont (button);
		bdiv.setFont (button);
		bmul.setFont (button);
		badd.setFont (button);
		bsub.setFont (button);
		bclear.setFont (button);
		bequal.setFont (button);   
		//-------------------------------------------------------------------------------------
		l1.setBounds(5,10,380,50);
		b1.setBounds(0,240,60,60);
		b2.setBounds(80,240,60,60);
		b3.setBounds(160,240,60,60);
		b4.setBounds(0,160,60,60);
		b5.setBounds(80,160,60,60);
		b6.setBounds(160,160,60,60);
		b7.setBounds(0,80,60,60);
		b8.setBounds(80,80,60,60);
		b9.setBounds(160,80,60,60);
		b0.setBounds(0,320,60,60);
		b00.setBounds(80,320,60,60);
		bdot.setBounds(160,320,60,60);
		badd.setBounds(240,240,60,60);
		bsub.setBounds(320,240,60,60);
		bmul.setBounds(240,160,60,60);
		bdiv.setBounds(320,160,60,60);
		bclear.setBounds(320,80,60,60);
		bequal.setBounds(240,320,140,60);
		bbackspace.setBounds(240,80,60,60);
		//-------------------------------------------------------------------------------------
		l1.setBackground(Color.DARK_GRAY);
		l1.setForeground(Color.YELLOW);
		bclear.setBackground(Color.RED);
		bclear.setForeground(Color.WHITE);
		bequal.setBackground(Color.BLUE);
		bequal.setForeground(Color.WHITE);
		//-------------------------------------------------------------------------------------
		f.add(l1);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(b0);
		f.add(b00);
		f.add(bdot);
		f.add(bmul);
		f.add(bdiv);
		f.add(badd);
		f.add(bsub);
		f.add(bequal);
		f.add(bclear);
		f.add(bbackspace);
		//-------------------------------------------------------------------------------------
		b1.addActionListener(this);  // REGISTERING OR CREATING AN OBJECT FOR SUB_CLASS.
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		b00.addActionListener(this);
		bdiv.addActionListener(this);
		bmul.addActionListener(this);
		bsub.addActionListener(this);
		badd.addActionListener(this);
		bdot.addActionListener(this);
		bequal.addActionListener(this);
		bclear.addActionListener(this);
		bbackspace.addActionListener(this);
		
		f.setLayout(null);
		f.setSize(415,440); 
		f.setVisible(true);
		f.setResizable(false);
	}
//-------------------------------------------------------------------------------------
    public void actionPerformed(ActionEvent e) // "actionPerformed" METHOD.
    {
		Object source = e.getSource();
		DecimalFormat dc  = new DecimalFormat("##.##");
		
				if(source==bclear)
				{
					l1.setText("0");
					number1=0;
					symbol='+';
				}
				else if(source==b1)
				{
					String str=l1.getText();
					if(str.charAt(0)=='0'&& str.length()==1)
					{
						l1.setText("1");
					}
					else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='*'||str.charAt(str.length()-1)=='/')
					{
						l1.setText("1");
					}
					else 
					{
						l1.setText(str+"1");
					}
				}	
				else if(source==b2)
				{
					String str=l1.getText();
					if(str.charAt(0)=='0'&& str.length()==1)
					{
						l1.setText("2");
					}
					else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='*'||str.charAt(str.length()-1)=='/')
					{
						l1.setText("2");
					}
					else 
					{
						l1.setText(str+"2");
					}
				}	
				else if(source==b3)
				{
					String str=l1.getText();
					if(str.charAt(0)=='0'&& str.length()==1)
					{
						l1.setText("3");
					}
					else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='*'||str.charAt(str.length()-1)=='/')
					{
						l1.setText("3");
					}
					else 
					{
						l1.setText(str+"3");
					}
				}	
				else if(source==b4)
				{
					String str=l1.getText();
					if(str.charAt(0)=='0' && str.length()==1)
					{
						l1.setText("4");
					}
					else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='*'||str.charAt(str.length()-1)=='/')
					{
						l1.setText("4");
					}
					else 
					{
						l1.setText(str+"4");
					}
				}	
				else if(source==b5)
				{
					String str=l1.getText();
					if(str.charAt(0)=='0'&& str.length()==1)
					{
						l1.setText("5");
					}
					else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='*'||str.charAt(str.length()-1)=='/')
					{
						l1.setText("5");
					}
					else 
					{
						l1.setText(str+"5");
					}
				}	
				else if(source==b6)
				{
					String str=l1.getText();
					if(str.charAt(0)=='0'&&str.length()==1)
					{
						l1.setText("6");
					}
					else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='*'||str.charAt(str.length()-1)=='/')
					{
						l1.setText("6");
					}
					else 
					{
						l1.setText(str+"6");
					}
				}	
				else if(source==b7)
				{
					String str=l1.getText();
					if(str.charAt(0)=='0'&& str.length()==1)
					{
						l1.setText("7");
					}
					else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='*'||str.charAt(str.length()-1)=='/')
					{
						l1.setText("7");
					}
					else 
					{
						l1.setText(str+"7");
					}
				}	
				else if(source==b8)
				{
					String str=l1.getText();
					if(str.charAt(0)=='0'&& str.length()==1)
					{
						l1.setText("8");
					}
					else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='*'||str.charAt(str.length()-1)=='/')
					{
						l1.setText("8");
					}
					else 
					{
						l1.setText(str+"8");
					}
				}	
				else if(source==b9)
				{
					String str=l1.getText();
					if(str.charAt(0)=='0'&& str.length()==1)
					{
						l1.setText("9");
					}
					else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='*'||str.charAt(str.length()-1)=='/')
					{
						l1.setText("9");
					}
					else 
					{
						l1.setText(str+"9");
					}
				}	
				else if(source==b0)
				{
					String str=l1.getText();
					if(str.charAt(0)=='0'&& str.length()==1)
					{
						l1.setText("0");
					}
					else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='*'||str.charAt(str.length()-1)=='/')
					{
						l1.setText("0");
					}
					else 
					{
						l1.setText(str+"0");
					}
				}	
				else if(source==b00)
				{
					String str=l1.getText();
					if(str.charAt(0)=='0'&& str.length()==1)
					{
						l1.setText("0");
					}
					else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='*'||str.charAt(str.length()-1)=='/')
					{
						l1.setText("0");
					}
					else 
					{
						l1.setText(str+"00");
					}
				}	
				
				else if(source==bdot)
				{
					String str=l1.getText();
					if(str.charAt(0)=='0'&& str.length()==1)
					{
						l1.setText("0.");
					}
					else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='*'||str.charAt(str.length()-1)=='/')
					{
						l1.setText("0.");
					}
					else 
					{
						l1.setText(str+".");
					}
				}	
				else if(source==bbackspace)
				{
					String str=l1.getText();
					if(str.charAt(0)=='0'&& str.length()==1)
					{
						l1.setText("0");
					}
					else if(str.length()==1)
					{
						l1.setText("0");

					}
					else if(str.charAt(0)=='='||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='*'||str.charAt(str.length()-1)=='/')
					{
					
					}
					else 
					{
						str=str.substring(0,str.length()-1);
						l1.setText(str);
					}
				}	
				else if(source==badd)
				{
					String str=l1.getText();
					if(str.charAt(0)=='=')
					{
						str=str.substring(1);
						number1=Double.parseDouble(str);
						l1.setText(str+"+");
					}
					else if(str.charAt(str.length()-1)==symbol)
					{
						str=str.substring(0,str.length()-1)+"+";
						l1.setText(str);
						symbol='+';
					}
					else if(str.charAt(0)=='0'&& str.length()==1)
					{
						l1.setText("0+");
					}
				
					else 
					{
						if(symbol=='-')
						{
							number1=number1-Double.parseDouble(str);
						}
						else if(symbol=='*')
						{
							number1=number1*Double.parseDouble(str);
						}
						else if(symbol=='/')
						{
							number1=number1/Double.parseDouble(str);
						}
						else if(symbol=='+')
						{
							number1=number1+Double.parseDouble(str);
						}

						// number1=dc.format(number1);
						str=Double.toString(number1);
						l1.setText(str+"+");
						symbol='+';
					}
				}
				else if(source==bsub)
				{
					String str=l1.getText();
					if(str.charAt(0)=='=')
					{
						str=str.substring(1);
						number1=Double.parseDouble(str);
						l1.setText(str+"-");
					}
					else if(str.charAt(str.length()-1)==symbol)
					{
						str=str.substring(0,str.length()-1)+"-";
						l1.setText(str);
						symbol='-';
					}
					else if(str.charAt(0)=='0'&& str.length()==1)
					{
						l1.setText("0-");
					}
					else 
					{
						if(symbol=='-')
						{
							number1=number1-Double.parseDouble(str);
						}
						else if(symbol=='*')
						{
							number1=number1*Double.parseDouble(str);
						}
						else if(symbol=='/')
						{
							number1=number1/Double.parseDouble(str);
						}
						else if(symbol=='+')
						{
							number1=number1+Double.parseDouble(str);
						}

						
						// number1=dc.format(number1);
						str=Double.toString(number1);
						l1.setText(str+"-");
						symbol='-';
					}
				}
				else if(source==bmul)
				{
					String str=l1.getText();
					if(str.charAt(0)=='=')
					{
						str=str.substring(1);
						number1=Double.parseDouble(str);
						l1.setText(str+"*");
					}
					else if(str.charAt(str.length()-1)==symbol)
					{
						str=str.substring(0,str.length()-1)+"*";
						l1.setText(str);
						symbol='*';
					}
					else if(str.charAt(0)=='0'&& str.length()==1)
					{
						l1.setText("0*");
					}
					else 
					{
						if(symbol=='-')
						{
							number1=number1-Double.parseDouble(str);
						}
						else if(symbol=='*')
						{
							number1=number1*Double.parseDouble(str);
						}
						else if(symbol=='/')
						{
							number1=number1/Double.parseDouble(str);
						}
						else if(symbol=='+')
						{
							number1=number1+Double.parseDouble(str);
						}

					
						// number1=dc.format(number1);
						str=Double.toString(number1);
						l1.setText(str+"*");
						symbol='*';
					}
				}
				else if(source==bdiv)
				{
					String str=l1.getText();
					if(str.charAt(0)=='=')
					{
						str=str.substring(1);
						number1=Double.parseDouble(str);
						l1.setText(str+"/");
					}
					else if(str.charAt(str.length()-1)==symbol)
					{
						str=str.substring(0,str.length()-1)+"/";
						l1.setText(str);
						
						symbol='/';

					}
					else if(str.charAt(0)=='0'&& str.length()==1)
					{
						l1.setText("0/");
					}
					else 
					{
						if(symbol=='-')
						{
							number1=number1-Double.parseDouble(str);
						}
						else if(symbol=='*')
						{
							number1=number1*Double.parseDouble(str);
						}
						else if(symbol=='/')
						{
							number1=number1/Double.parseDouble(str);
						}
						else if(symbol=='+')
						{
							number1=number1+Double.parseDouble(str);
						}
						// number1=dc.format(number1);
						str=Double.toString(number1);
						l1.setText(str+"/");
						symbol='/';
					}
				}
				else if(source==bequal)
				{
					String str=l1.getText();
				 if(str.charAt(str.length()-1)==symbol)
					{
						str="="+str.substring(0,str.length()-1);
						l1.setText(str);
						symbol='+';
						number1=0;
					}
					else if(str.charAt(0)=='0'&& str.length()==1)
					{
						l1.setText("0");
					}
					else 
					{
						if(symbol=='-')
						{
							number1=number1-Double.parseDouble(str);
						}
						else if(symbol=='*')
						{
							number1=number1*Double.parseDouble(str);
						}
						else if(symbol=='/')
						{
							number1=number1/Double.parseDouble(str);
						}
						else if(symbol=='+')
						{
							number1=number1+Double.parseDouble(str);
						}

				     	// number1=dc.format(number1);
						str=Double.toString(number1);
						l1.setText("="+str);
						symbol='+';
						number1=0;
				   }  // ELSE CLOSING.
					
			  }  // ELSE-IF CLOSING.

		 } // "actionPerformed" METHOD CLOSING.
//----------------------------------------------------------------------------------------
    public static void main(String[] args) 
	{
	   new TLS1();
	}
    
    
} // "MAIN CLASS" CLOSING.