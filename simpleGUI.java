package sasd;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;

public  class simpleGUI implements ActionListener
{
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;

	
	
	public static void main (String args[]) {
		
		simpleGUI gui = new simpleGUI();
		gui.go();
		
	}
	public void go() {
		 JFrame frame =new JFrame();
		 JPanel panel1 =new JPanel();
		
		 
	
		panel1.setBackground(Color.DARK_GRAY);
		
		
		
		
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
		button1 =new JButton("Yellow");
		button2 =new JButton("Green");
		button3 =new JButton("Blue");
		button4 =new JButton("Red");
		
	
		
		
		button1.addActionListener( new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	panel1.setBackground(Color.YELLOW);
		      }
		    });
		
		
		button2.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	panel1.setBackground(Color.GREEN);
		      }
		    });
		
		
		button3.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	panel1.setBackground(Color.BLUE);
		      }
		    });
		button4.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	panel1.setBackground(Color.RED);
		      }
		    });
		
		frame.getContentPane().add(BorderLayout.WEST, button1);
		frame.getContentPane().add(BorderLayout.NORTH, button2);
		frame.getContentPane().add(BorderLayout.EAST, button3);
		frame.getContentPane().add(BorderLayout.SOUTH, button4);
		frame.getContentPane().add(BorderLayout.CENTER, panel1);
		
		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(400, 400);
		frame.setVisible(true);
	}
	
	
	
	

	
}