package event;

import java.awt.*;    
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame; 
import javax.swing.*;



public class form {    
public static void main(String[] args) { 
	
	
	   JFrame f = new JFrame("Sign In");  
	
	   Font m = new Font("Serif", Font.BOLD, 15);
	   Font m1 = new Font("Serif", Font.BOLD, 25);
	  
	 //textfield1
   
    final TextField tf=new TextField();    
    tf.setBounds(150,50, 150,20);  
    final TextField tf1=new TextField();    
    tf1.setBounds(150,100, 150,20); 
    final TextField tf2=new TextField();    
    tf2.setBounds(150,150, 150,20); 
    f.add(tf);    
    f.add(tf1); 
    f.add(tf2); 
    
  //labels
  	Label l1, l2,l3,l4,l5,l6;  
  
  	
  	 l1 = new Label ("Frst name");   
  	 l2 = new Label ("Second name");   
  	 l3 = new Label ("phone");  
  	 l4 = new Label ("Gender");
  	 l5 = new Label ("Position");
  	 l6 = new Label ("Registration form");
     l1.setBounds(50, 50, 100, 30);    
	 l2.setBounds(50, 100, 100, 30);  
	 l3.setBounds(50, 150, 100, 30);
	 l4.setBounds(50, 190, 100, 30);
	 l5.setBounds(50, 230, 100, 30);
	 l6.setBounds(50, 00, 200, 30);
	 l1.setFont(m);
	 l2.setFont(m);
	 l3.setFont(m);
	 l4.setFont(m);
	 l5.setFont(m);
	 l6.setFont(m1);
	 f.add(l1);  
     f.add(l2); 
	 f.add(l3);
	 f.add(l4);
	 f.add(l5);
	 f.add(l6);
	 
	 //chechkbox1
	 CheckboxGroup cbg = new CheckboxGroup();  
     Checkbox checkBox1 = new Checkbox("Male", cbg, false);    
     checkBox1.setBounds(250,180, 50,50);    
     Checkbox checkBox2 = new Checkbox("Female", cbg, true);    
     checkBox2.setBounds(150,180, 60,50);    
     f.add(checkBox1);    
     f.add(checkBox2);   
     
     //dropdown1
     Choice c = new Choice();     
     c.setBounds(150, 230, 150, 75);   
     c.add("Software developer 1");   
     c.add("Software developer 2");    
     c.add("Software developer 3");    
     c.add("Software developer 4");    
     c.add("Software developer 5");    
     f.add(c);    
     
     //button
     Button b=new Button("Click Here");    
 
  b.setBounds(50,270,60,30);   
  b.addActionListener(new ActionListener() 
  {    
  public void actionPerformed (ActionEvent e) 
  {    
          tf.setText("Alfy");
          tf1.setText("N A");
          tf2.setText("9497406602");
      }    
  });  

  f.add(b);  
     
     
	 
	 
    
    
    f.setSize(1000,1000);    
    f.setLayout(null);    
    f.setVisible(true); 
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}    
}    

